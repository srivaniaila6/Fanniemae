package com.techouts.fanniemae.util;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.techouts.fanniemae.consts.FanniemaeConstants;
import com.techouts.fanniemae.dto.testcase.SuiteResult;
import com.techouts.fanniemae.dto.testcase.TestCaseResult;
import com.techouts.fanniemae.registry.Registry;
import com.techouts.fanniemae.registry.RegistryKey;

public class TestReportGenerator {
	
	private static final Logger LOG = Logger.getLogger(TestReportGenerator.class.getName());
	
	public void generate(){
		LOG.debug("Generating CSV TestReport for current execution.");
		Object obj = Registry.getAttribute(RegistryKey.TEST_SUITE_RESULT);
		if(Objects.nonNull(obj)){
			SuiteResult suiteResult = ((SuiteResult)obj);
			if(Objects.nonNull(suiteResult.getTestCaseResults())){
				List<String[]> lines = new ArrayList<>();
				lines.add(new String[] {"Id","TestCaseName","Result","Comment"});
				for(TestCaseResult result : suiteResult.getTestCaseResults()){
					lines.add(new String[] {result.getId(),result.getTestCase(), result.isPassedAsString(), (StringUtils.isNotBlank(result.getComment()) ? result.getComment() : StringUtils.EMPTY)});
				}
				Path path = Paths.get(PathProvider.getForReportsDir().toString(), PathProvider.getCSVTestReportFileName() +((String)Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX))+ FanniemaeConstants.DOT_CSV);
				CSVUtil.writeToCSV(lines, path);
				LOG.debug("CSV TestResultReport["+path+"] generated.");
			}
		}
		else
			LOG.warn("Found SuiteResult empty/null from Registry.");
	}
}