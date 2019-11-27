package com.techouts.fanniemae.page.elements;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElementFactory1 {
	
	//supplier
   @FindBy(xpath="//*[@id=\"body_x_prxCaptcha_x_divCaptcha\"]")
   private WebElement securityControlCaptcha;

    public WebElement getSecurityControlCaptcha() {
	     return securityControlCaptcha;
     }
    
    @FindBy(xpath="//*[@id='body_x_prxCustom_x_phcHelpdesk']/tbody/tr[2]/td/table/tbody/tr/td[1]/strong/a/b/span")
    private WebElement newSupplier;
    
    @FindBy(id="proxyActionBar_x__cmdSave_btn2")
    private WebElement registrationRequest;

     public WebElement getRegistrationRequest() {
 	     return registrationRequest;
      }
    
    public WebElement getNewSupplier() {
    	return newSupplier;
    }

    @FindBy(xpath="//*[@id=\"body_x_prxCaptcha_x_txtCaptcha_x_x\"]")
    private WebElement securityControl;
    
    @FindBy(id="body_x_txtSocialReason_x_x")
    private WebElement corporateName;
    
    @FindBy(id="body_x_txtTva_x_x")
    private WebElement federalTaxID;
    
    @FindBy(id="ddlbody_x_ddlLegalForm_x")
    private WebElement supplierType;
    
    @FindBy(id="body_x_txtLastname_x_x")
    private WebElement lastName;
    
    @FindBy(id="body_x_txtFunction_x_txtFunctionen")
    private WebElement title;
    
    @FindBy(xpath="/html/body/form[1]/div/div[2]/div/table/tbody/tr[2]/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[3]/td[2]/table/tbody/tr/td/input")
    private WebElement passwordInSupplierRegister;
    
    @FindBy(id="body_x_txtPhoneNumber_x_x")
    private WebElement phoneNumber;
    
    @FindBy(id="body_x_txtFirstname_x_x")
    private WebElement firstNumber;
    
    @FindBy(id="body_x_txtEmail_x_x")
    private WebElement emailOfSupplierRegisterContact;
    
    @FindBy(id="body_x_txtPassConfirm_x_x")
    private WebElement confirmPassword;
    
    @FindBy(id="body_x_proxyAdrOff_x_txtVoie_x_x")
    private WebElement addressLine1;
    
    @FindBy(id="body_x_proxyAdrOff_x_txtCity_x_x")
    private WebElement city;
    
    @FindBy(id="ddlbody_x_proxyAdrOff_x_ddlState_x")
    private WebElement state;
    
    @FindBy(xpath="//input[@id='body_x_proxyAdrOff_x_txtZip_x_x']")
    private WebElement zipCode;
    
    @FindBy(xpath="//select[@id='ddlbody_x_proxyAdrOff_x_ddlPays_x']")
    private WebElement country;
    
    public WebElement getCountry() {
    	return country;
    }
    
    public WebElement getZipCode() {
    	return zipCode;
    }
    
    public WebElement getState() {
    	return state;
    }
    
    public WebElement getCity() {
    	return city;
    }
    
    public WebElement getAddressLine1() {
    	return addressLine1;
    }
    
    public WebElement getConfirmPassword() {
    	return confirmPassword;
    }
    
    public WebElement getEmailOfSupplierRegisterContact() {
    	return emailOfSupplierRegisterContact;
    }
    
    public WebElement getFirstNumber() {
    	return firstNumber;
    }
    
    public WebElement getPhoneNumber() {
    	return phoneNumber;
    }
    
    public WebElement getPasswordInSupplierRegister() {
    	return passwordInSupplierRegister;
    }
    
    public WebElement getTitle() {
    	return title;
    }
    
    public WebElement getLastName() {
    	return lastName;
    }
    
    public WebElement getSupplierType() {
    	return supplierType;
    }
    
    public WebElement getFederalTaxID() {
    	return federalTaxID;
    }
    
    public WebElement getCorporateName() {
    	return corporateName;
    }
    
    public WebElement getSecurityControl() {
    	return securityControl;
    }

//Login details
	@FindBy(id="body_x_txtLogin_x_x")
	private WebElement userName;
	
	@FindBy(id="body_x_txtPass_x_x")
	private WebElement password;
	
	@FindBy(name="body:x:btnLogin_btn2")
	private WebElement loginButton;
	
	public WebElement getLogin() {
		return loginButton;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getUserName() {
		return userName;
	}
	//Integration
	
	@FindBy(id="link_ivmenu00_menu_9")
	private WebElement integration;
	
	@FindBy(id="link_ivmenu00_menu_9_sub0")
	private WebElement importManagement;
	
	@FindBy(xpath="//input[@id=\"body_x_txtQuery_x_x\"]")
	private WebElement keywordsInImportManagement;
	
	@FindBy(id="body_x_selImportType_x_txtselImportType_x_x")
	private WebElement importType;
	
	@FindBy(id="body_x_ddlImportState_x")
	private WebElement anomalies;
	
	@FindBy(id="body_x_txtDate_x_x")
	private WebElement dateInImportManagement;
	
	@FindBy(id="body_x_txtDate_x_rtxtDate_x_x")
	private WebElement dateToInImportManagement;
	
	@FindBy(id="body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	private WebElement searchButton;
	
	@FindBy(id="body_x_ddlSystem_x")
	private WebElement systemInImportManagement;
	
	@FindBy(id="proxyActionBar_x_new_import_btn2")
	private WebElement createAnImportButton;
	
	@FindBy(id="body_x_proxyImportType_x_txtQuery_x_x")
	private WebElement keywordsInCreateAnImport;
	
	@FindBy(id="ddlbody_x_proxyImportType_x_selStatus_x")
	private WebElement statusInCreateAnImport;
	
	@FindBy(id="ddlbody_x_proxyImportType_x_ddlDeploy_x")
	private WebElement deployedInCreateAnImport;
	
	public WebElement getDeployedInCreateAnImport() {
		return deployedInCreateAnImport;
	}
	
	public WebElement getStatusInCreateAnImport() {
		return statusInCreateAnImport;
	}
	
	public WebElement getKeywordsInCreateAnImport() {
		return keywordsInCreateAnImport;
	}
	
	public WebElement getSearch() {
		return searchButton;
	}
	
	public WebElement getCreateAnImport() {
		return createAnImportButton;
	}
	
	public WebElement getSystem() {
		return systemInImportManagement;
	}
	
	public WebElement getDateToInImportManagement() {
		return dateToInImportManagement;
	}
	
	public WebElement getDateInImportManagement() {
		return dateInImportManagement;
	}
	
	public WebElement getAnomalies() {
		return anomalies;
	}
	
	public WebElement getImportType() {
		return importType;
	}
	
	public WebElement getKeywordsInImportManagement() {
		return keywordsInImportManagement;
	}
	
	public WebElement getImportManagement() {
		return importManagement;
	}
	
	
	public WebElement getIntegration() {
		return integration;
	}
	//Import types List
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub0")
	private WebElement importTypesList;
	
	@FindBy(id="body_x_txtQuery_x_x")
	private WebElement keywords;
	
	@FindBy(id="ddlbody_x_ddlDeploy_x")
	private WebElement deployInTypesList;
	
	@FindBy(id="ddlbody_x_selStatus_x")
	private WebElement statusInImportTypesList;
	
	@FindBy(id="proxyActionBar_x_btnCopy_btn2")
	private WebElement duplicateOnExistingImportType;
	
	@FindBy(id="body_x_selImportType_x_txtselImportType_x_x")
	private WebElement sourceImportType;
	
	@FindBy(id="body_x_txtCode_x_x")
	private WebElement code;
	
	@FindBy(id="body_x_txtLabel_x_x")
	private WebElement label;
	
	@FindBy(id="proxyActionBar_x__cmdEnd_btn2")
	private WebElement copyAndClose;
	
	@FindBy(name="proxyActionBar:x:BackAction_btn2")
	private WebElement close;
	
	@FindBy(id="proxyActionBar_x_btnAdd_btn2")
	private WebElement createANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtCode_x_x")
	private WebElement codeIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtLabel_x_txtLabelen")
	private WebElement labelIncreateANewImportType;
	
	@FindBy(id="ddlbody_x_tab_x_prxInfo_x_prxprxInfo_x_selModule_x")
	private WebElement moduleIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_selAuth_x_txtselAuth_x_x")
	private WebElement authorisationIncreateANewImportType;
	
	@FindBy(xpath="//input[@id=\"body_x_tab_x_prxInfo_x_prxprxInfo_x_chkOnlyAuthor_x0\"]")
	private WebElement visibleToImportAuthorsOnlyIncreateANewImportType;
	
	@FindBy(id="ddlbody_x_tab_x_prxInfo_x_prxprxInfo_x_selSystem_x")
	private WebElement systemIncreateANewImportType;
	
	@FindBy(id="ddlbody_x_tab_x_prxInfo_x_prxprxInfo_x_selStatus_x")
	private WebElement statusIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_chkInsertOnly_x0")
	private WebElement authoriseInsertionsOnlyIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_ddlDefaultUpdateStrategy_x")
	private WebElement defaultUpdateStrategyIncreateANewImportType;
	
	@FindBy(id="ddlbody_x_tab_x_prxInfo_x_prxprxInfo_x_selTransaction_x")
	private WebElement transactionTypeIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtAnoUrl_x_x")
	private WebElement correctionOfAnomaliesScreenIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtOrder_x_x")
	private WebElement orderIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtDesc_x_txtDescen")
	private WebElement descriptionIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtXPathRoot_x_x")
	private WebElement xpathRootIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtFirstLine_x_x")
	private WebElement firstLineIndexIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtLastLine_x_x")
	private WebElement lastRowsToImportIncreateANewImportType;
	
	@FindBy(id="ddlbody_x_tab_x_prxInfo_x_prxprxInfo_x_selFileFormat_x")
	private WebElement flatFileFormatIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_ddlEncoding_x")
	private WebElement textEncodingIncreateANewImportType;
	
	@FindBy(xpath="//input[@id=\"body_x_tab_x_prxInfo_x_prxprxInfo_x_txtFileTemplate_x_x\"]")
	private WebElement filesTemplateNameIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtLineRetention_x_x")
	private WebElement importedLinesIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtFileRetention_x_x")
	private WebElement importedFilesIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_txtLogRetention_x_x")
	private WebElement logsIncreateANewImportType;
	
	@FindBy(id="body_x_tab_x_prxInfo_x_prxprxInfo_x_chkTrim_x0")
	private WebElement trimExtraSpacesIncreateANewImportType;
	
	public WebElement getTrimExtraSpacesIncreateANewImportType() {
		return trimExtraSpacesIncreateANewImportType;
	}
	
	public WebElement getLogsIncreateANewImportType() {
		return logsIncreateANewImportType;
	}
	
	public WebElement getImportedFilesIncreateANewImportType() {
		return importedFilesIncreateANewImportType;
	}
	
	public WebElement getImportedLinesIncreateANewImportType() {
		return importedLinesIncreateANewImportType;
	}
	
	public WebElement getFilesTemplateNameIncreateANewImportType() {
		return filesTemplateNameIncreateANewImportType;
	}
	
	public WebElement gettextEncodingIncreateANewImportType() {
		return textEncodingIncreateANewImportType;
	}
	
	public WebElement getflatFileFormatIncreateANewImportType() {
		return flatFileFormatIncreateANewImportType;
	}
	
	public WebElement getLastRowsToImportIncreateANewImportType() {
		return lastRowsToImportIncreateANewImportType;
	}
	
	public WebElement getFirstLineIndexIncreateANewImportType() {
		return firstLineIndexIncreateANewImportType;
	}
	
	public WebElement getxpathRootIncreateANewImportType() {
		return xpathRootIncreateANewImportType;
	}
	
	public WebElement getDescriptionIncreateANewImportType() {
		return descriptionIncreateANewImportType;
	}
	
	public WebElement getOrderIncreateANewImportType() {
		return orderIncreateANewImportType;
	}
	
	public WebElement getCorrectionOfAnomaliesScreenIncreateANewImportType() {
		return correctionOfAnomaliesScreenIncreateANewImportType;
	}
	
	public WebElement getTransactionTypeIncreateANewImportType() {
		return transactionTypeIncreateANewImportType;
	}
	
	public WebElement getDefaultUpdateStrategyIncreateANewImportType() {
		return defaultUpdateStrategyIncreateANewImportType;
	}
	
	public WebElement getAuthoriseInsertionsOnlyIncreateANewImportType() {
		return authoriseInsertionsOnlyIncreateANewImportType;
	}
	
	public WebElement getStatusIncreateANewImportType() {
		return statusIncreateANewImportType;
	}
	
	public WebElement getSystemIncreateANewImportType() {
		return systemIncreateANewImportType;
	}
	
	public WebElement getVisibleToImportAuthorsOnlyIncreateANewImportType() {
		return visibleToImportAuthorsOnlyIncreateANewImportType;
	}
	
	public WebElement getAuthorisationIncreateANewImportType() {
		return authorisationIncreateANewImportType;
	}
	
	public WebElement getModuleIncreateANewImportType() {
		return moduleIncreateANewImportType;
	}
	
	public WebElement getLabelIncreateANewImportType() {
		return labelIncreateANewImportType;
	}
	
	public WebElement getCodeIncreateANewImportType() {
		return codeIncreateANewImportType;
	}
	
	public WebElement getCreateANewImportType() {
		return createANewImportType;
	}
	
	public WebElement getClose() {
		return close;
	}
	
	public WebElement getCopyAndClose() {
		return copyAndClose;
	}
	
	public WebElement getLabel() {
		return label;
	}
	
	public WebElement getCode() {
		return code;
	}
	
	public WebElement getSourceImportType() {
		return sourceImportType;
	}
	
	public WebElement getDuplicateOnExistingImportType() {
		return duplicateOnExistingImportType;
	}
	
	public WebElement getStatusInImportTypesList() {
		return statusInImportTypesList;
	}
	
	public WebElement getDeploy() {
		return deployInTypesList;
	}
	
	public WebElement getKeywords() {
		return keywords;
	}
	
	public WebElement getImportTypesList() {
		return importTypesList;
	}
	//import Flush
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub0_sub0")
    private WebElement importFileplush;
	
	@FindBy(id="body_x_selTypeSelector_x_txtselTypeSelector_x_x")
    private WebElement importTypeInImportFileplush;
	
	@FindBy(id="ddlbody_x_ddlSysSelector_x")
    private WebElement systemInImportFileplush;
	
	public WebElement getSystemInImportFileplush() {
		return systemInImportFileplush;
	}
	
	public WebElement getImportTypeInImportFileplush() {
		return importTypeInImportFileplush;
	}
	
	public WebElement getImportFileplush() {
		return importFileplush;
	}
	//Organisatonal mapping
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub0_sub1")
    private WebElement organisationalMapping;
	
	@FindBy(id="body_x_ddlModule_x")
    private WebElement moduleInOrganisationalMapping;
	
	@FindBy(id="body_x_ddlTable_x")
    private WebElement tableInOrganisationalMapping;
	
	@FindBy(id="body_x_ddlTableType_x")
private WebElement tableType;
	
	public WebElement getTableType() {
		return tableType;
	}
	@FindBy(id="body_x_chkReviewTranslations_x0")
    private WebElement reviewsTransactionInOrganisationalMapping;
	
	@FindBy(id="body_x_txtQuery_x_x")
    private WebElement keywordsInOrganisationalMapping;
	
	@FindBy(id="body_x_prxFilterBar_x_cmdSearchBtn_btn2")
    private WebElement searchInOrganisationalMapping;
	
	@FindBy(id="body_x_c_anpoint_id_x_txtc_anpoint_id_x_x")
    private WebElement auctionMessagesInOrganisationalMapping;
	
	@FindBy(id="body_x_btnAdd_btn2")
    private WebElement addRowInOrganisationalMapping;
	
	@FindBy(id="body_x_c_auc_id_x_btnc_auc_id_btn2")
    private WebElement auctionMessagesBtnAddRow;
	
	@FindBy(id="body_x_selOrga_x_txtselOrga_x_x")
    private WebElement organisationInAuctionMessages;
	
	@FindBy(id="ddlbody_x_selStatus_x")
    private WebElement statusInAuctionMessages;
	
	@FindBy(id="body_x_selFam_x_txtselFam_x_x")
    private WebElement commodityInAuctionMessages;
	
	@FindBy(id="body_x_ddlOwner_x_txtddlOwner_x_x")
    private WebElement ownerInAuctionMessages;
	
    @FindBy(id="body_x_selProcess_x_txtselProcess_x_x")
    private WebElement sourcingProjectInAuctionMessages;
    
    @FindBy(id="body_x_c_imptype_code_x_txtc_imptype_code_x_x")
    private WebElement importTypeInOrganisationalTrascodifications;
    
    @FindBy(id="ddlbody_x_c_sys_code_x")
    private WebElement spendGroupInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_c_cost_center_code_x_x")
    private WebElement costCenterInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_c_receiving_location_x_x")
    private WebElement receivingLocationInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_c_orga_level_x_txtc_orga_level_x_x")
    private WebElement organisationInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_c_entity_code_x_x")
    private WebElement entityCodeInOrganisationalTrascodifications;
    
    @FindBy(id="proxyActionBar_x_btnScript_btn2")
    private WebElement generateInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_txtScript_x_x")
    private WebElement generateSplInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_prxFilterBar_x__ctl0")
    private WebElement advanceSearchInOrganisationalTrascodifications;
    
    @FindBy(id="body_x_c_otrans_id_x_txtc_otrans_id_x_x")
    private WebElement organisationalTrascodifications;
	
	public WebElement getOrganisationalTrascodifications() {
		return organisationalTrascodifications;
	}
	
	public WebElement getAdvanceSearchInOrganisationalTrascodifications() {
		return advanceSearchInOrganisationalTrascodifications;
	}
	
	public WebElement getGenerateSqlInOrganisationalTrascodifications() {
		return generateSplInOrganisationalTrascodifications;
	}
	
	public WebElement getGenerateInOrganisationalTrascodifications() {
		return generateInOrganisationalTrascodifications;
	}
	
	public WebElement getEntityCodeInOrganisationalTrascodifications() {
		return entityCodeInOrganisationalTrascodifications;
	}
	
	public WebElement getOrganisationInOrganisationalTrascodifications() {
		return organisationInOrganisationalTrascodifications;
	}
	
	public WebElement getReceivingLocationInOrganisationalTrascodifications() {
		return receivingLocationInOrganisationalTrascodifications;
	}
	
	public WebElement getCostCenterInOrganisationalTrascodifications() {
		return costCenterInOrganisationalTrascodifications;
	}
	
	public WebElement getSpendGroupInOrganisationalTrascodifications() {
		return spendGroupInOrganisationalTrascodifications;
	}
	
	public WebElement getImportTypeInOrganisationalTrascodifications() {
		return importTypeInOrganisationalTrascodifications;
	}
	
	
	public WebElement getSourcingProjectInAuctionMessages() {
		return sourcingProjectInAuctionMessages;
	}
	
    
	public WebElement getOwnerInAuctionMessages() {
		return ownerInAuctionMessages;
	}
	
	public WebElement getCommodityInAuctionMessages() {
		return commodityInAuctionMessages;
	}
	
	public WebElement getStatusInAuctionMessages() {
		return statusInAuctionMessages;
	}
	
	public WebElement getAuctionMessagesBtnInAddRow() {
		return organisationInAuctionMessages;
	}
	
	public WebElement getAuctionMessagesBtnInOrganisationalMapping() {
		return auctionMessagesBtnAddRow;
	}
	
	public WebElement getAddRowInOrganisationalMapping() {
		return addRowInOrganisationalMapping;
	}
	
	public WebElement getAuctionMessagesInOrganisationalMapping() {
		return auctionMessagesInOrganisationalMapping;
	}
	
	public WebElement getSearchInOrganisationalMapping() {
		return searchInOrganisationalMapping;
	}
	
	public WebElement getKeywordsInOrganisationalMapping() {
		return keywordsInOrganisationalMapping;
	}
	
	public WebElement getReviewsTransaction() {
		return reviewsTransactionInOrganisationalMapping;
	}
	
	public WebElement getTable() {
		return tableInOrganisationalMapping;
	}
	
	public WebElement getModule() {
		return moduleInOrganisationalMapping;
	}
	
	public WebElement getOrganisationalMapping() {
		return organisationalMapping;
	}
	@FindBy(id="ddlbody_x_ddlStatus_x")
	private WebElement status1;
	
	public WebElement getstatus1() {
		return status1;
	}
	
	
	//Transaction purchasing classification  
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub0_sub2")
	private WebElement transactionPurchasingClassification;
	
	@FindBy(id="body_x_c_ftrans_id_x_txtc_ftrans_id_x_x")
	private WebElement commodityTransactionPurchasingClassification;
	
	@FindBy(id="body_x_prxFilterBar_x_cmdRazBtn_btn2")
	private WebElement reset;
	
	@FindBy(id="body_x_c_lmethod_code_x_x")
	private WebElement codeInLoadMethods;
	
	@FindBy(id="body_x_c_lmethod_label__x_c_lmethod_label_en")
	private WebElement labelInLoadMethods;
	
	@FindBy(id="body_x_c_lmethod_order_x_x")
	private WebElement orderInLoadMethods;
	
	@FindBy(id="body_x_c_lmethod_algorithm_x_x")
	private WebElement invokedFunctionInLoadMethods;
	
	@FindBy(id="ddlbody_x_c_lmethod_code_x")
	private WebElement loadMethods;
	
	@FindBy(id="body_x_prxCubeCreate_x_txtQuery_x_x")
	private WebElement keywords1InCubeManage;
	
	@FindBy(id="body_x_prxCubeCreate_x_prxFilterBar_x_cmdSearchBtn_btn2")
	private WebElement searchInCubeManage;
	
	@FindBy(id="body_x_prxCubeCreate_x_prxFilterBar_x_cmdRazBtn_btn2")
	private WebElement resetInCubeManage;
	
	@FindBy(id="link_ivmenu00_menu_9_sub1_sub4")
	private WebElement measures;
	
	public WebElement getMeasures() {
		return measures;
	}
	
	public WebElement getResetInCubeManage() {
		return resetInCubeManage;
	}
	
	public WebElement getSearchInCubeManage() {
		return searchInCubeManage;
	}
	
	public WebElement getKeywordsInCubeManage() {
		return keywords1InCubeManage;
	}
	
	public WebElement getLoadMethods() {
		return loadMethods;
	}
	
	public WebElement getInvokedFunctionInLoadMethods() {
		return invokedFunctionInLoadMethods;
	}
	
	public WebElement getOrderInLoadMethods() {
		return orderInLoadMethods;
	}
	
	public WebElement getLabelInLoadMethods() {
		return labelInLoadMethods;
	}
	
	public WebElement getCodeInLoadMethods() {
		return codeInLoadMethods;
	}
	
	public WebElement getReset() {
		return reset;
	}
	
	public WebElement getCommodityTransactionPurchasingClassification() {
		return commodityTransactionPurchasingClassification;
	}
	
	public WebElement getTransactionPurchasingClassification() {
		return transactionPurchasingClassification;
	}
	//SupplierTrascoding
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub0_sub3")
	private WebElement supplierTrascoding ;
	
	@FindBy(id="body_x_c_suptrans_id_x_txtc_suptrans_id_x_x")
	private WebElement supplierTranscodification ;
	
	@FindBy(id="body_x_c_imptype_code_x_txtc_imptype_code_x_x")
	private WebElement importTypeInSupplierTranscodification ;
	
	@FindBy(id="ddlbody_x_c_sys_code_x")
	private WebElement systemInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_suptrans_code_x_x")
	private WebElement codeInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_suptrans_label_x_x")
	private WebElement labelInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_suptrans_siren_x_x")
	private WebElement sirenInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_suptrans_duns_x_x")
	private WebElement dunsInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_sup_id_x_txtc_sup_id_x_x")
	private WebElement supplierIDInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_status_code_x_x")
	private WebElement statusInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_imp_id_x_x")
	private WebElement importIDInSupplierTranscodification ;
	
	@FindBy(id="body_x_c_impline_id_x_x")
	private WebElement lineIDInSupplierTranscodification ;
	
	public WebElement getLineIDInSupplierTranscodification(){
		return lineIDInSupplierTranscodification;
	}
	
	public WebElement getImportIDInSupplierTranscodification(){
		return importIDInSupplierTranscodification;
	}
	
	public WebElement getStatusInSupplierTranscodification(){
		return statusInSupplierTranscodification;
	}
	
	public WebElement getSupplierIDInSupplierTranscodification(){
		return supplierIDInSupplierTranscodification;
	}
	
	public WebElement getDunsInSupplierTranscodification(){
		return dunsInSupplierTranscodification;
	}
	
	public WebElement getsirenInSupplierTranscodification(){
		return sirenInSupplierTranscodification;
	}
	
	public WebElement getLabelInSupplierTranscodification(){
		return labelInSupplierTranscodification;
	}
	
	public WebElement getCodeInSupplierTranscodification(){
		return codeInSupplierTranscodification;
	}
	
	public WebElement getSystemInSupplierTranscodification() {
		return systemInSupplierTranscodification;
	}
	
	public WebElement getImportTypeInSupplierTranscodification() {
		return importTypeInSupplierTranscodification;
	}
	
	public WebElement getSupplierTranscodification() {
		return supplierTranscodification;
	}
	
	public WebElement getSupplierTrascoding() {
		return supplierTrascoding;
	}
	//interfacesMonitoringConsole
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub1")
	private WebElement interfacesMonitoringConsole ;
	
	@FindBy(id="ddlbody_x_selInterfaceType_x")
	private WebElement interfaceTypeInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_txtBegin_x_x")
	private WebElement lastExecutionBetweenInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_txtEnd_x_x")
	private WebElement lastExecutionBetweenAndInInterfacesMonitoringConsole ;
	
	@FindBy(id="proxyActionBar_x__cmdCrea_btn2")
	private WebElement createInInterfacesMonitoringConsole;
	
	@FindBy(id="body_x_txtCode_x_x")
	private WebElement codeInInterfacesMonitoringConsole ;
	
	@FindBy(id="ddlbody_x_selInterfaceType_x")
	private WebElement typeInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_selTimeZone_x_txtselTimeZone_x_x")
	private WebElement timeZoneInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_txtLabel_x_txtLabelen")
	private WebElement labelInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_ddlStatus_x")
	private WebElement statusInInterfacesMonitoringConsole ;
	

	@FindBy(id="body_x_txtFrequency_x_x")
	private WebElement executionFrequencyInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_txtFrequency_ddlPeriodicity_x")
	private WebElement executionPriodInInterfacesMonitoringConsole ;
	
	@FindBy(id="body_x_txtNextExecution_x_x")
	private WebElement nextExecution ;
	
	@FindBy(id="body_x_txtNextExecution_selTTNextExecution_x_txtselTTNextExecution_x_x")
	private WebElement nextExecutionTime ;
	
	public WebElement getNextExecutionTime(){
		return nextExecutionTime;
	}
	
	public WebElement getNextExecution(){
		return nextExecution;
	}
	
	public WebElement getExecutionPeriod(){
		return executionPriodInInterfacesMonitoringConsole;
	}
	
	public WebElement getExecutionFrequency(){
		return executionFrequencyInInterfacesMonitoringConsole;
	}
	
	public WebElement getStatusInInterfacesMonitoringConsole(){
		return statusInInterfacesMonitoringConsole;
	}
	
	public WebElement getLabelInInterfacesMonitoringConsole(){
		return labelInInterfacesMonitoringConsole;
	}
	
	public WebElement getTimeZoneInInterfacesMonitoringConsole(){
		return timeZoneInInterfacesMonitoringConsole;
	}
	
	public WebElement getTypeInInterfacesMonitoringConsole(){
		return typeInInterfacesMonitoringConsole;
	}
	
	public WebElement getCodeInInterfacesMonitoringConsole(){
		return codeInInterfacesMonitoringConsole;
	}
	
	public WebElement getCreate(){
		return createInInterfacesMonitoringConsole;
	}
	
	public WebElement getLastExecutionAnd(){
		return lastExecutionBetweenAndInInterfacesMonitoringConsole;
	}
	
	public WebElement getLastExecution(){
		return lastExecutionBetweenInInterfacesMonitoringConsole;
	}
	
	public WebElement getInterfaceTypeInInterfacesMonitoringConsole(){
		return interfaceTypeInInterfacesMonitoringConsole;
	}
	
	public WebElement getInterfacesMonitoringConsole(){
		return interfacesMonitoringConsole;
	}
	//interfaceExecutionControl
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub1_sub0")
	private WebElement interfaceExecutionControl ;
	
	@FindBy(id="ddlbody_x_selInterface_x")
	private WebElement interfaceType ;
	
	@FindBy(id="body_x_txtDate_x_x")
	private WebElement executionBetween;
	
	@FindBy(id="body_x_txtDate_x_selTT_x_txtselTT_x_x")
	private WebElement executionBetweenTime;
	
	@FindBy(id="body_x_txtDate_x_rtxtDate_x_x")
	private WebElement executionBetweenAnd;
	
	@FindBy(id="body_x_txtDate_x_rtxtDate_x_selTT_x_txtselTT_x_x")
	private WebElement executionBetweenAndTime;
	
	@FindBy(id="ddlbody_x_selStatusCode_x")
	private WebElement statusInInterfaceExeConsole;
	
	@FindBy(id="body_x_selContext_x_txtselContext_x_x")
	private WebElement executionContextInInterfaceExeConsole;
	
	public WebElement getExecutionContextInInterfaceExeConsole(){
		return executionContextInInterfaceExeConsole;
	}
	
	public WebElement getStatusInInterfaceExeConsole(){
		return statusInInterfaceExeConsole;
	}
	
	public WebElement getExecutionBetweenAndTime(){
		return executionBetweenAndTime;
	}
	
	public WebElement getExecutionBetweenAnd(){
		return executionBetweenAnd;
	}
	
	public WebElement getExecutionBetweenTime(){
		return executionBetweenTime;
	}
	
	public WebElement getExecutionBetween(){
		return executionBetween;
	}
	
	public WebElement getInterfaceType(){
		return interfaceType;
	}
	
	public WebElement getInterfaceExecutionControl(){
		return interfaceExecutionControl;
	}
	//APIconsole
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub1_sub1")
	private WebElement apiConsole;
	
	@FindBy(xpath="/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div/div[1]/strong/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]/input")
	private WebElement objectID;
	
	@FindBy(xpath="/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div/div[1]/strong/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]/input")
	private WebElement pageSize;
	
	@FindBy(xpath="/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div/div[1]/strong/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr[3]/td[2]/input")
	private WebElement pageNumber;
	
	@FindBy(xpath="/html/body/form[1]/div/div[2]/table/tbody/tr/td/div/div/div[1]/strong/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr[4]/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/select")
	private WebElement format;
	
	@FindBy(xpath="body_x_tabApi_x_c88b79fc-9449-46f0-994c-d6b1607dac90_x_3e733afe-4bfb-4154-9465-fd178d2f3ed8_x_btnTest_btn2")
	private WebElement request;
	
	@FindBy(xpath="/html/body/form[1]/div[1]/div[2]/table/tbody/tr/td/div/div/div[1]/strong/table/tbody/tr/td/span[2]/span/input")
	private WebElement test;
	
	@FindBy(id="proxyActionBar_x_ManageAPI_btn2")
	private WebElement manageAPIS;
	
	@FindBy(id="body_x_c_api_code_api_method_x_txtc_api_code_api_method_x_x")
	private WebElement APIS;
	
	public WebElement getAPIS(){
		return APIS;
	}
	
	public WebElement getManageAPIS(){
		return manageAPIS;
	}
	
	public WebElement getTest(){
		return test;
	}
	
	public WebElement getRequest(){
		return request;
	}
	
	public WebElement getFormat(){
		return format;
	}
	
	public WebElement getPageNumber(){
		return pageNumber;
	}
	
	public WebElement getPageSize(){
		return pageSize;
	}
	
	
	public WebElement getObjectID(){
		return objectID;
	}
	
	public WebElement getAPIConsole(){
		return apiConsole;
	}
	
	//AS2FileSenderlink_ivmenu00_menu_9_sub0_sub1_sub2
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub1_sub2")
	private WebElement AS2FileSender;
	
	@FindBy(id="body_x_txtFrom_x_x")
	private WebElement AS2From;
	
	@FindBy(id="body_x_txtTo_x_x")
	private WebElement AS2To;
	
	@FindBy(id="body_x_txtUrl_x_x")
	private WebElement url;
	
	@FindBy(id="body_x_txtTimeout_x_x")
	private WebElement timeOut;
	
	@FindBy(id="body_x_ddlCertificateLocalMachine_x")
	private WebElement signCertificate;
	
	@FindBy(id="body_x_txtPassword_x_x")
	private WebElement signCertificatePassword;
	
	public WebElement getSignCertificatePassword(){
		return signCertificatePassword;
	}
	
	public WebElement getSignCertificate(){
		return signCertificate;
	}
	
	public WebElement getTimeOut(){
		return timeOut;
	}
	
	public WebElement getUrl(){
		return url;
	}
	
	public WebElement getAS2To(){
		return AS2To;
	}
	
	public WebElement getAS2From(){
		return AS2From;
	}
	
	public WebElement getAS2FileSender(){
		return AS2FileSender;
	}
	//tokenList
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub1_sub3")
	private WebElement tokenList;
	
	@FindBy(id="proxyActionBar_x_new_token_btn2")
	private WebElement newToken;
	
	@FindBy(id="body_x_txtToken_x_x")
	private WebElement token;
	
	public WebElement getToken(){
		return token;
	}
	
	public WebElement getNewToken(){
		return newToken;
	}
	
	public WebElement getTokenList(){
		return tokenList;
	}
	//callBacks//link_ivmenu00_menu_9_sub0_sub2
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub2")
	private WebElement callBacks;
	
	@FindBy(id="link_ivmenu00_menu_9_sub0_sub3")
	private WebElement retrospectiveUpdates;
	
	@FindBy(id="ddlbody_x_selSysCode_x")
	private WebElement systemRetrospectiveUpdates;
	
	@FindBy(id="body_x_txtDateFrom_x_x")
	private WebElement fromRetrospectiveUpdates;
	
	@FindBy(id="body_x_txtDateTo_x_x")
	private WebElement toRetrospectiveUpdates;
	
	@FindBy(id="proxyActionBar_x_new_retroactive_update_btn2")
	private WebElement createANewUpdateRetrospectiveUpdates;
	
	@FindBy(id="body_x_selImptypeCode_x_txtselImptypeCode_x_x")
	private WebElement importTypeRetrospectiveUpdates;
	
	@FindBy(id="body_x_chkAllImp_x0")
	private WebElement allImportTypeRetrospectiveUpdates;
	
	@FindBy(id="body_x_selImp_account_plan_default_en_x_txtselImp_account_plan_default_en_x_x")
	private WebElement import1;
	
	public WebElement getImportRetrospectiveUpdates(){
		return import1;
	}
	
	public WebElement getAllImportTypeRetrospectiveUpdates(){
		return allImportTypeRetrospectiveUpdates;
	}
	
	public WebElement getImportTypeRetrospectiveUpdates(){
		return importTypeRetrospectiveUpdates;
	}
	
	public WebElement getCreateANewUpdateRetrospectiveUpdates(){
		return createANewUpdateRetrospectiveUpdates;
	}
	
	public WebElement getToRetrospectiveUpdates(){
		return toRetrospectiveUpdates;
	}
	
	public WebElement getFromRetrospectiveUpdates(){
		return fromRetrospectiveUpdates;
	}
	
	public WebElement getSystemRetrospectiveUpdates(){
		return systemRetrospectiveUpdates;
	}
	
	public WebElement getRetrospectiveUpdates(){
		return retrospectiveUpdates;
	}
	
	public WebElement getCallBacks(){
		return callBacks;
	}
	
	//cubeManage//
	@FindBy(id="link_ivmenu00_menu_9_sub1")
	private WebElement cubeManage;
	
	@FindBy(id="body_x_prxCubeCreate_x_txtQuery_x_x")
	private WebElement keywordsInCubeManage;
	
	@FindBy(id="ddlbody_x_prxCubeCreate_x_selMgroupStatus_x")
	private WebElement keywordDropDownInCubeManage;
	
	@FindBy(id="link_ivmenu00_menu_9_sub1_sub0")
	private WebElement ssasSession;
	
	@FindBy(id="body_x_txtQuery_x_x")
	private WebElement keywordsInSsasSession;
	
	@FindBy(id="proxyActionBar_x_CancelSessionCommandBtn_btn2")
	private WebElement cancelCommands;
	
    @FindBy(id="body_x_ddlStatus_x")
	private WebElement statusSsAs;
    
    @FindBy(id="link_ivmenu00_menu_9_sub1_sub1")
	private WebElement generateDimensions;
	
    @FindBy(id="ddlbody_x_tc_x_tpcInfo_x_selDimension_x")
	private WebElement dimension;
    
    @FindBy(id="link_ivmenu00_menu_9_sub1_sub2")
	private WebElement dataSources;
    
    @FindBy(id="link_ivmenu00_menu_9_sub1_sub3")
	private WebElement measureGroups;
    
//    @FindBy(id="link_ivmenu00_menu_9_sub1_sub3")
//	private WebElement measureGroups;
//	
//	public WebElement getMeasureGroups(){
//		return measureGroups;
//	}
//	
	public WebElement getMeasureGroups(){
		return measureGroups;
	}
	
	public WebElement getDataSources(){
		return dataSources;
	}
	
	public WebElement getDimension(){
		return dimension;
	}
    
	public WebElement getGenerateDimensions(){
		return generateDimensions;
	}
	
	public WebElement getStatusSsAs(){
		return statusSsAs;
	}
	
	public WebElement getCancelCommands(){
		return cancelCommands;
	}
	
	public WebElement getkeywordsInSsasSession(){
		return keywordsInSsasSession;
	}
	
	public WebElement getSsasSession(){
		return ssasSession;
	}
	
	public WebElement getKeywordDropDownInCubeManage(){
		return keywordDropDownInCubeManage;
	}
	
	public WebElement getkeywordsInCubeManage(){
		return keywordsInCubeManage;
	}
	
	public WebElement getCubeManage(){
		return cubeManage;
	}
	//projects
	@FindBy(id="link_ivmenu00_menu_1")
	private WebElement projects;
	
	@FindBy(id="link_ivmenu00_menu_1_sub0")
	private WebElement browseProjects;
	
	@FindBy(id="body_x_ddlProcessType_x_txtddlProcessType_x_x")
	private WebElement typeProjects;
	
	@FindBy(id="body_x_selLogin_x_txtselLogin_x_x")
	private WebElement userProjects;
	
	@FindBy(id="proxyActionBar_x_copy_new_process_btn2")
	private WebElement duplicateProjects;
	
	@FindBy(id="body_x_selProcess_x_txtselProcess_x_x")
	private WebElement processToDuplicate;
	
	@FindBy(id="proxyActionBar_x_BackAction_btn2")
	private WebElement closeInProjects;
	
	@FindBy(id="proxyActionBar_x__cmdEnd_btn2")
	private WebElement copyAndCloseInProjects;
	
	@FindBy(id="proxyActionBar_x_add_new_process_btn2")
	private WebElement createProject;
	
	@FindBy(id="body_x_prxEtap_x_txtName_x_txtNameen")
	private WebElement projectName;
	
	@FindBy(id="body_x_prxEtap_x_ddlType_x_txtddlType_x_x")
	private WebElement typeInCreateProject;
	
	@FindBy(id="body_x_prxEtap_x_selMainFamily_x_txtselMainFamily_x_x")
	private WebElement primaryCategory;
	
	@FindBy(id="body_x_prxEtap_x_selMainEntity_x_txtselMainEntity_x_x")
	private WebElement costCenter;
	
	@FindBy(id="body_x_prxEtap_x_ddlStatus_x")
	private WebElement projectStatus;
	
	private WebElement projectValue;
	
	@FindBy(id="body_x_prxEtap_x_txtBpmEstimatedSavings_x_x")
	private WebElement projectSaving;
	
	@FindBy(id="body_x_prxEtap_x_txtBpmCompletionDate_x_x")
	private WebElement projectCompletionDate;
	
	@FindBy(id="body_x_prxEtap_x_txtBpmFmTxtproductservice_x_x")
	private WebElement projectDescription;
	
	@FindBy(id="link_ivmenu00_menu_1_sub1")
	private WebElement rfxTemplatesAdministration;
	
	@FindBy(id="proxyActionBar_x_add_new_rfptype_btn2")
	private WebElement createNewRfxType;
	
	@FindBy(id="link_ivmenu00_menu_1_sub2")
	private WebElement browseAuction;
	
	@FindBy(id="body_x_selOrga_x_txtselOrga_x_x")
	private WebElement organisationBrowseAuction;
	
	@FindBy(id="body_x_ddlOwner_x_txtddlOwner_x_x")
	private WebElement ownerBrowseAuction;
	
	@FindBy(id="body_x_selProcess_x_txtselProcess_x_x")
	private WebElement sourcingProject;
	
	@FindBy(id="body_x_selProject_x_txtselProject_x_x")
	private WebElement Project1;
	
	@FindBy(id="proxyActionBar_x_duplicate_auction_btn2")
	private WebElement duplicateAnAction;
	
	@FindBy(id="body_x_txtLabel_x_x")
	private WebElement nameOfAction;
	
	@FindBy(id="proxyActionBar_x_add_new_auction_btn2")
	private WebElement createAction;
	
	@FindBy(id="body_x_txtLabel_x_x")
	private WebElement auctionShortDescription;
	
	@FindBy(id="ddlbody_x_selCurrency_x")
	private WebElement mainCurrency;
	
	@FindBy(id="link_ivmenu00_menu_1_sub3")
	private WebElement proposalEvaluation;
	
	@FindBy(id="body_x_selContact_x_txtselContact_x_x")
	private WebElement evaluator;
	
	@FindBy(id="body_x_selBpmId_x_txtselBpmId_x_x")
	private WebElement businessProject;
	
	@FindBy(id="body_x_selQstEvalPeriod_x_txtselQstEvalPeriod_x_x")
	private WebElement evaluatedPeriod;
	
	@FindBy(id="body_x_selRfpId_x_btnselRfpId_btn2")
	private WebElement rfxButton;
	
	@FindBy(xpath="//input[@id='body_x_selProposal_x_txtselProposal_x_x']")
	private WebElement proposal;
	 
	@FindBy(xpath="//input[@id=\"body_x_tabc_x_prxInfo_x_prxprxInfo_x_c_rfptype_code_x_x\"]")
	private WebElement rfxCode;
	
	@FindBy(id="body_x_tabc_x_prxInfo_x_prxprxInfo_x_c_rfptype_label__x_c_rfptype_label_en")
	private WebElement rfxENTable;
	
	@FindBy(id="body_x_tabc_x_prxInfo_x_prxprxInfo_x_c_rfptype_order_x_x")
	private WebElement order;
	
	public WebElement getOrder() {
		return order;
	}
	
	public WebElement getRfxENTable() {
		return rfxENTable;
	}
	
	public WebElement getRfxCode() {
		return rfxCode;
	}
	
	public WebElement getProposal(){
		return proposal;
	}
	
	public WebElement getRFXButton(){
		return rfxButton;
	}
	
	public WebElement getEvaluatedPeriod(){
		return evaluatedPeriod;
	}
	
	public WebElement getBusinessProject(){
		return businessProject;
	}
	
	public WebElement getEvaluator(){
		return evaluator;
	}
	
	public WebElement getProposalEvaluation(){
		return proposalEvaluation;
	}
	
	public WebElement getMainCurrency(){
		return mainCurrency;
	}
	
	public WebElement getAuctionShortDescription(){
		return auctionShortDescription;
	}
	
	public WebElement getCreateAction(){
		return createAction;
	}
	
	public WebElement getNameOfAction(){
		return nameOfAction;
	}
	
	public WebElement getDuplicateAnAction(){
		return duplicateAnAction;
	}
	
	public WebElement getProject1(){
		return Project1;
	}
	
	public WebElement getSourcingProject(){
		return sourcingProject;
	}
	
	public WebElement getOwnerBrowseAuction(){
		return ownerBrowseAuction;
	}
	
	public WebElement getOrganisationBrowseAuction(){
		return organisationBrowseAuction;
	}
	
	public WebElement getBrowseAuction(){
		return browseAuction;
	}
	
	public WebElement getCreateNewRfxType(){
		return createNewRfxType;
	}
	
	public WebElement getRfxTemplatesAdministration(){
		return rfxTemplatesAdministration;
	}
	
	public WebElement getProductDescription(){
		return projectDescription;
	}
	
	public WebElement getProjectCompletionDate(){
		return projectCompletionDate;
	}
	
	public WebElement getProjectSaving(){
		return projectSaving;
	}
	
	public WebElement getProjectValue(){
		return projectValue;
	}
	
	public WebElement getProjectStatus(){
		return projectStatus;
	}
	
	public WebElement getCostCenter(){
		return costCenter;
	}
	
	public WebElement getPrimaryCategory(){
		return primaryCategory;
	}
	
	public WebElement getTypeInCreateProject(){
		return typeInCreateProject;
	}
	
	public WebElement getProjectName(){
		return projectName;
	}
	
	public WebElement getCreateProject(){
		return createProject;
	}
	
	public WebElement getCopyAndCloseInProjects(){
		return copyAndCloseInProjects;
	}
	
	public WebElement getCloseInProjects(){
		return closeInProjects;
	}
	
	public WebElement getProcessToDuplicate(){
		return processToDuplicate;
	}
	
	public WebElement getDuplicateProjects(){
		return duplicateProjects;
	}
	
	public WebElement getUserProjects(){
		return userProjects;
	}
	
	public WebElement getTypeProjects(){
		return typeProjects;
	}
	
	public WebElement getBrowseProjects(){
		return browseProjects;
	}
	
	public WebElement getProjects(){
		return projects;
	}
	
}

