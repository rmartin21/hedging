package com.abbvie.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abbvie.dao.HedgeDAO;
import com.abbvie.to.BaseComparisonDataTO;
import com.abbvie.to.BaseHedgeTransactionsTO;
import com.abbvie.to.CostCenterTO;
import com.abbvie.to.DocumentTypeTO;
import com.abbvie.to.HistF9i7TO;
import com.abbvie.to.HistFbl1nTO;
import com.abbvie.to.HistFbl3nTO;
import com.abbvie.to.HistFbl5nTO;
import com.abbvie.to.PloTO;
import com.abbvie.to.ProfitCenterTO;


// TODO: Auto-generated Javadoc
/**
 * The Class HedgeDAOImpl.
 */
@Repository	
@PropertySource("classpath:sql.properties")	
public class HedgeDAOImpl implements HedgeDAO{
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/** The count profit center query. */
	@Value("${count-profit-center-query}")
	private String countProfitCenterQuery;
	
	/** The profit center query. */
	@Value("${profit-center-query}")
	private String profitCenterQuery;
	
	/** The count cost center query. */
	@Value("${count-cost-center-query}")
	private String countCostCenterQuery;
	
	/** The cost center query. */
	@Value("${cost-center-query}")
	private String costCenterQuery;
	
	/** The count document type query. */
	@Value("${count-document-type-query}")
	private String countDocumentTypeQuery;
	
	/** The document type query. */
	@Value("${document-type-query}")
	private String documentTypeQuery;
	
	/** The count plo query. */
	@Value("${count-plo-query}")
	private String countPloQuery;
	
	/** The plo query. */
	@Value("${plo-query}")
	private String ploQuery;
	
	/** The count hist fbl 1 n query. */
	@Value("${count-hist-fbl1n-query}")
	private String countHistFbl1nQuery;
	
	/** The hist fbl 1 n query. */
	@Value("${hist-fbl1n-query}")
	private String histFbl1nQuery;
	
	/** The count hist fbl 3 n query. */
	@Value("${count-hist-fbl3n-query}")
	private String countHistFbl3nQuery;
	
	/** The hist fbl 3 n query. */
	@Value("${hist-fbl3n-query}")
	private String histFbl3nQuery;
	
	/** The count hist F 9 i 7 query. */
	@Value("${count-hist-f9i7-query}")
	private String countHistF9i7Query;
	
	/** The hist F 9 i 7 query. */
	@Value("${hist-f9i7-query}")
	private String histF9i7Query;
	
	/** The count hist fbl 5 n query. */
	@Value("${count-hist-fbl5n-query}")
	private String countHistFbl5nQuery;
	
	/** The hist fbl 5 n query. */
	@Value("${hist-fbl5n-query}")
	private String histFbl5nQuery;
	
	/** The count base hedge transactions query. */
	@Value("${count-base-hedge-transactions-query}")
	private String countBaseHedgeTransactionsQuery;
	
	/** The base hedge transactions query. */
	@Value("${base-hedge-transactions-query}")
	private String baseHedgeTransactionsQuery;
	
	/** The count base comparison data query. */
	@Value("${count-base-comparison-data-query}")
	private String countBaseComparisonDataQuery;
	
	/** The base comparison data query. */
	@Value("${base-comparison-data-query}")
	private String baseComparisonDataQuery;
	
	/* (non-Javadoc)
	 * @see com.abbvie.dao.HistDAO#getProfitCenterDetails()
	 */
	@Transactional(readOnly=true)
	public List<ProfitCenterTO> getProfitCenterDetails() {
		int profitCenterQueryCount = jdbcTemplate.queryForObject(countProfitCenterQuery, int.class);
		jdbcTemplate.setFetchSize(profitCenterQueryCount);
		List<ProfitCenterTO> profitCenterList = jdbcTemplate.query(profitCenterQuery, new RowMapper<ProfitCenterTO>() {
            public ProfitCenterTO mapRow(ResultSet result, int rowNum) throws SQLException {
            	ProfitCenterTO profitCenterTO = new ProfitCenterTO();
            	profitCenterTO.setProfitCenter(result.getString("PROFIT_CENTER"));
            	profitCenterTO.setCoArea(result.getString("CO_AREA"));
            	profitCenterTO.setPersonResponsible(result.getString("PERSON_RESPONSIBLE"));
            	profitCenterTO.setUserResponsible(result.getString("USER_RESPONSIBLE"));
            	profitCenterTO.setProfitCenterName(result.getString("PROFIT_CENTER_NAME"));
            	profitCenterTO.setLanguageUsed(result.getString("LANGUAGE_USED"));
            	profitCenterTO.setValidTo(result.getString("VALID_TO"));
                return profitCenterTO;
            }
        });
		
		return profitCenterList;
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.dao.HistDAO#getCostCenterDetails()
	 */
	@Transactional(readOnly=true)
	public List<CostCenterTO> getCostCenterDetails() {
		int costCenterQueryCount = jdbcTemplate.queryForObject(countCostCenterQuery, int.class);
		jdbcTemplate.setFetchSize(costCenterQueryCount);
		List<CostCenterTO> costCenterList = jdbcTemplate.query(costCenterQuery, new RowMapper<CostCenterTO>() {
            public CostCenterTO mapRow(ResultSet result, int rowNum) throws SQLException {
            	CostCenterTO costCenterTO = new CostCenterTO();
            	costCenterTO.setCostCenter(result.getString("COST_CENTER"));
            	costCenterTO.setCoArea(result.getString("CO_AREA"));
            	costCenterTO.setCompCode(result.getString("COMP_CODE"));
            	costCenterTO.setCctc(result.getString("CCTC"));
            	costCenterTO.setPersonResponsible(result.getString("PERSON_RESPONSIBLE"));
            	costCenterTO.setUserResponsible(result.getString("USER_RESPONSIBLE"));
            	costCenterTO.setShortText(result.getString("SHORT_TEXT"));
            	costCenterTO.setLanguageUsed(result.getString("LANGUAGE_USED"));
            	costCenterTO.setValidFrom(result.getString("VALID_FROM"));
            	costCenterTO.setValidTo(result.getString("VALID_TO"));
            	costCenterTO.setmCode(result.getString("M_CODE"));
                return costCenterTO;
            }
        });
		return costCenterList;
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.dao.HistDAO#getDocumentTypeDetails()
	 */
	@Transactional(readOnly=true)
	public List<DocumentTypeTO> getDocumentTypeDetails() {
		int documentTypeQueryCount = jdbcTemplate.queryForObject(countDocumentTypeQuery, int.class);
		jdbcTemplate.setFetchSize(documentTypeQueryCount);
		List<DocumentTypeTO> documentTypeList = jdbcTemplate.query(documentTypeQuery, new RowMapper<DocumentTypeTO>() {
            public DocumentTypeTO mapRow(ResultSet result, int rowNum) throws SQLException {
            	DocumentTypeTO documentTypeTO = new DocumentTypeTO();
            	documentTypeTO.setDocumentType(result.getString("DOCUMENT_TYPE"));
            	documentTypeTO.setDocumentDesc(result.getString("DOCUMENT_DESC"));
                return documentTypeTO;
            }
        });
		return documentTypeList;
	}
	


	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getPloDetails()
	 */
	@Transactional(readOnly=true)
	public List<PloTO> getPloDetails() {
		int ploQueryCount = jdbcTemplate.queryForObject(countPloQuery, int.class);
		jdbcTemplate.setFetchSize(ploQueryCount);
		List<PloTO> ploList = jdbcTemplate.query(ploQuery, new RowMapper<PloTO>() {	
			public PloTO mapRow(ResultSet result, int rowNum) throws SQLException {
		    	PloTO ploTO = new PloTO();
		    	ploTO.setCurrency(result.getString("CURRENCY"));
		    	ploTO.setCurrencyType(result.getString("CURRENCY_TYPE"));
		    	ploTO.setAccountNumber(result.getString("ACCOUNT_NUMBER"));
		    	ploTO.setProfitCenter(result.getString("PROFIT_CENTER"));
		    	ploTO.setCompanyCode(result.getString("COMPANY_CODE"));
		    	ploTO.setBusinessArea(result.getString("BUSINESS_AREA"));
		    	ploTO.setFunctionalArea(result.getString("FUNCTIONAL_AREA"));
		    	ploTO.setSegment(result.getString("SEGMENT"));
		    	ploTO.setAccumbalPrevPeriod(result.getString("ACCUMBAL_PREV_PERIOD"));
		    	ploTO.setDebit1111(result.getString("DEBIT_11_11"));
		    	ploTO.setCredit1111(result.getString("CREDIT_11_11"));
		    	ploTO.setCumCreditBalance(result.getString("CUM_DEBIT_BALANCE"));
		    	ploTO.setCumCreditBalance(result.getString("CUM_CREDIT_BALANCE"));
		    	ploTO.setAccumulatedBalance(result.getString("ACCUMULATED_BALANCE"));
				return ploTO;
		    }
		});
		return ploList;
	}
	


	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getFbl1nDetails()
	 */
	@Transactional(readOnly=true)
	public List<HistFbl1nTO> getFbl1nDetails() {
		int histFbl1nQueryCount = jdbcTemplate.queryForObject(countHistFbl1nQuery, int.class);
		jdbcTemplate.setFetchSize(histFbl1nQueryCount);
		List<HistFbl1nTO> histFbl1nTOList = jdbcTemplate.query(histFbl1nQuery, new RowMapper<HistFbl1nTO>() {	
			public HistFbl1nTO mapRow(ResultSet result, int rowNum) throws SQLException {
				HistFbl1nTO histFbl1nTO = new HistFbl1nTO();
				histFbl1nTO.setClearedOpenItemsSymbol(result.getString("CLEARED_OPEN_ITEMS_SYMBOL"));
				histFbl1nTO.setAssignment(result.getString("ASSIGNMENT"));
				histFbl1nTO.setDocumentNumber(result.getString("DOCUMENT_NUMBER"));
				histFbl1nTO.setDocumentType(result.getString("DOCUMENT_TYPE"));
				histFbl1nTO.setDocumentDate(result.getString("DOCUMENT_DATE"));
				histFbl1nTO.setSpecialGlInd(result.getString("SPECIAL_GL_IND"));
				histFbl1nTO.setNetDueDateSymbol(result.getString("NET_DUE_DATE_SYMBOL"));
				histFbl1nTO.setAmountInDocCurncy(result.getString("AMOUNT_IN_DOC_CURNCY"));
				histFbl1nTO.setDocumentCurncy(result.getString("DOCUMENT_CURNCY"));
				histFbl1nTO.setClearingDocument(result.getString("CLEARING_DOCUMENT"));
				histFbl1nTO.setText(result.getString("TEXT"));
				histFbl1nTO.setEntryDate(result.getString("ENTRY_DATE"));
				histFbl1nTO.setAccountNumber(result.getString("ACCOUNT_NUMBER"));
				histFbl1nTO.setCustomerVendorName(result.getString("CUSTOMER_VENDOR_NAME"));
				histFbl1nTO.setTradingPartner(result.getString("TRADING_PARTNER"));
				histFbl1nTO.setPostingDate(result.getString("POSTING_DATE"));
				histFbl1nTO.setNetDueDate(result.getString("NET_DUE_DATE"));
				histFbl1nTO.setClearingDate(result.getString("CLEARING_DATE"));
				histFbl1nTO.setPaymentBlock(result.getString("PAYMENT_BLOCK"));
				return histFbl1nTO;
		    }
		});
		
		return histFbl1nTOList;
	
	}
	


	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getFbl3nDetails()
	 */
	@Transactional(readOnly=true)
	public List<HistFbl3nTO> getFbl3nDetails() {
		int histFbl3nQueryCount = jdbcTemplate.queryForObject(countHistFbl3nQuery, int.class);
		jdbcTemplate.setFetchSize(histFbl3nQueryCount);
		List<HistFbl3nTO> histFbl3nTOList = jdbcTemplate.query(histFbl3nQuery, new RowMapper<HistFbl3nTO>() {	
			public HistFbl3nTO mapRow(ResultSet result, int rowNum) throws SQLException {
				HistFbl3nTO histFbl3nTO = new HistFbl3nTO();
				histFbl3nTO.setClearedOpenItemsSymbol(result.getString("CLEARED_OPEN_ITEMS_SYMBOL"));
				histFbl3nTO.setAssignment(result.getString("ASSIGNMENT"));
				histFbl3nTO.setDocumentNumber(result.getString("DOCUMENT_NUMBER"));
				histFbl3nTO.setBusinessArea(result.getString("BUSINESS_AREA"));
				histFbl3nTO.setDocumentType(result.getString("DOCUMENT_TYPE"));
				histFbl3nTO.setDocumentDate(result.getString("DOCUMENT_DATE"));
				histFbl3nTO.setPostingKey(result.getString("POSTING_KEY"));
				histFbl3nTO.setAmtInDocCurncy(result.getString("AMT_IN_DOC_CURNCY"));
				histFbl3nTO.setDocumentCurncy(result.getString("DOCUMENT_CURNCY"));
				histFbl3nTO.setTaxCode(result.getString("TAX_CODE"));
				histFbl3nTO.setClearingDocument(result.getString("CLEARING_DOCUMENT"));
				histFbl3nTO.setText(result.getString("TEXT"));
				histFbl3nTO.setEntryDate(result.getString("ENTRY_DATE"));
				histFbl3nTO.setAccountNumber(result.getString("ACCOUNT_NUMBER"));
				histFbl3nTO.setCompanyCode(result.getString("COMPANY_CODE"));
				histFbl3nTO.setLocalCurncy(result.getString("LOCAL_CURNCY"));
				histFbl3nTO.setAmtInLocalCurncy(result.getString("AMT_IN_LOCAL_CURNCY"));
				return histFbl3nTO;
		    }
		});
		
		return histFbl3nTOList;
	
	}
	


	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getF9i7Details()
	 */
	@Transactional(readOnly=true)
	public List<HistF9i7TO> getF9i7Details() {
		int histF9i7QueryCount = jdbcTemplate.queryForObject(countHistF9i7Query, int.class);
		jdbcTemplate.setFetchSize(histF9i7QueryCount);
		List<HistF9i7TO> histF9i7TOList = jdbcTemplate.query(histF9i7Query, new RowMapper<HistF9i7TO>() {	
		public HistF9i7TO mapRow(ResultSet result, int rowNum) throws SQLException {
			    HistF9i7TO histF9i7TO = new HistF9i7TO();
			    histF9i7TO.setPri(result.getString("PRI"));
			    histF9i7TO.setBkarea(result.getString("BKAREA"));
			    histF9i7TO.setItemNumber(result.getString("ITEM_NUMBER"));
			    histF9i7TO.setDisplay(result.getString("DISPLAY"));
			    histF9i7TO.setPtRefNumber(result.getString("PT_REF_NUMBER"));
			    histF9i7TO.setHyphenColumn(result.getString("HYPHEN_COLUMN"));
			    histF9i7TO.setPaymentItem(result.getString("PAYMENT_ITEM"));
			    histF9i7TO.setAccountNumber(result.getString("ACCOUNT_NUMBER"));
			    histF9i7TO.setAmountInAc(result.getString("AMOUNT_IN_AC"));
			    histF9i7TO.setCacur(result.getString("CACUR"));
			    histF9i7TO.setTaType(result.getString("TA_TYPE"));
			    histF9i7TO.setPostDate(result.getString("POST_DATE"));
			    histF9i7TO.setValueDate(result.getString("VALUE_DATE"));
			    histF9i7TO.setRefAcctNo1(result.getString("REF_ACCT_NO1"));
			    histF9i7TO.setRefBankKey(result.getString("REF_BANK_KEY"));
			    histF9i7TO.setRefBkCty(result.getString("REF_BK_CTY"));
			    histF9i7TO.setRefAcctNo2(result.getString("REF_ACCT_NO2"));
			    histF9i7TO.setTrPartner(result.getString("TR_PARTNER"));
			    histF9i7TO.setCurrency(result.getString("CURRENCY"));
			    return histF9i7TO;
		    }
		});
		
		return histF9i7TOList;
	
	}
	


	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getFbl5nDetails()
	 */
	@Transactional(readOnly=true)
	public List<HistFbl5nTO> getFbl5nDetails() {
		int histFbl5nQueryCount = jdbcTemplate.queryForObject(countHistFbl5nQuery, int.class);
		jdbcTemplate.setFetchSize(histFbl5nQueryCount);
		List<HistFbl5nTO> histFbl5nTOList = jdbcTemplate.query(histFbl5nQuery, new RowMapper<HistFbl5nTO>() {	
		public HistFbl5nTO mapRow(ResultSet result, int rowNum) throws SQLException {
			    HistFbl5nTO histFbl5nTO = new HistFbl5nTO();
			    histFbl5nTO.setAssignment(result.getString("ASSIGNMENT"));
			    histFbl5nTO.setDocumentNumber(result.getString("DOCUMENT_NUMBER"));
			    histFbl5nTO.setDocumentType(result.getString("DOCUMENT_TYPE"));
			    histFbl5nTO.setDocumentDate(result.getString("DOCUMENT_DATE"));
			    histFbl5nTO.setSpecialGlInd(result.getString("SPECIAL_GL_IND"));
			    histFbl5nTO.setAmountInDocCurncy(result.getString("AMOUNT_IN_DOC_CURNCY"));
			    histFbl5nTO.setDocumentCurncy(result.getString("DOCUMENT_CURNCY"));
			    histFbl5nTO.setAmountInLc(result.getString("AMOUNT_IN_LC"));
			    histFbl5nTO.setClearingDocument(result.getString("CLEARING_DOCUMENT"));
			    histFbl5nTO.setText(result.getString("TEXT"));
			    histFbl5nTO.setTradingPartner(result.getString("TRADING_PARTNER"));
			    histFbl5nTO.setEntryDate(result.getString("ENTRY_DATE"));
			    histFbl5nTO.setCustomerVendorName(result.getString("CUSTOMER_VENDOR_NAME"));
			    histFbl5nTO.setAccountNumber(result.getString("ACCOUNT_NUMBER"));
			    histFbl5nTO.setNetDueDate(result.getString("NET_DUE_DATE"));
			    histFbl5nTO.setPostingDate(result.getString("POSTING_DATE"));
				return histFbl5nTO;
		    }
		});
		
		return histFbl5nTOList;
	
	}
	
	
	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getBaseHedgeTransactions(int, int, int)
	 */
	@Transactional(readOnly=true)
	public List<BaseHedgeTransactionsTO> getBaseHedgeTransactions(int fiscalYear, int fiscalMonth, int hedgeVersion) {
		int baseHedgeTransactionsQueryCount = jdbcTemplate.queryForObject(countBaseHedgeTransactionsQuery, new Object[] { fiscalYear, fiscalMonth, hedgeVersion }, int.class);
		jdbcTemplate.setFetchSize(baseHedgeTransactionsQueryCount);
		List<BaseHedgeTransactionsTO> baseHedgeTransactionsTOList = jdbcTemplate.query(baseHedgeTransactionsQuery, new RowMapper<BaseHedgeTransactionsTO>() {	
		public BaseHedgeTransactionsTO mapRow(ResultSet result, int rowNum) throws SQLException {
			    BaseHedgeTransactionsTO baseHedgeTransactionsTO = new BaseHedgeTransactionsTO();
			    baseHedgeTransactionsTO.setFiscalYr(result.getString("FISCAL_YR"));
			    baseHedgeTransactionsTO.setFiscalMon(result.getString("FISCAL_MON"));
			    baseHedgeTransactionsTO.setFiscalYrMon(result.getString("FISCAL_YR_MON"));
			    baseHedgeTransactionsTO.setHedgeVersion(result.getString("HEDGE_VERSION"));
			    baseHedgeTransactionsTO.setHedgeVersionNm(result.getString("HEDGE_VERSION_NM"));
			    baseHedgeTransactionsTO.setDocNum(result.getString("DOC_NUM"));
			    baseHedgeTransactionsTO.setItemSd(result.getString("ITEM_SD"));
			    baseHedgeTransactionsTO.setDocnumItem(result.getString("DOCNUM_ITEM"));
			    baseHedgeTransactionsTO.setSopFamily(result.getString("SOP_FAMILY"));
			    baseHedgeTransactionsTO.setMatrlNo(result.getString("MATRL_NO"));
			    baseHedgeTransactionsTO.setMatrlDesc(result.getString("MATRL_DESC"));
			    baseHedgeTransactionsTO.setCountry(result.getString("COUNTRY"));
			    baseHedgeTransactionsTO.setRelvtForClrdItems(result.getString("RELVT_FOR_CLRD_ITEMS"));
			    baseHedgeTransactionsTO.setTotalPerDocNum(result.getString("TOTAL_PER_DOC_NUM"));
			    baseHedgeTransactionsTO.setShipmentFlag(result.getString("SHIPMENT_FLAG"));
			    baseHedgeTransactionsTO.setSapSeqNo(result.getString("SAP_SEQ_NO"));
			    baseHedgeTransactionsTO.setCompCode(result.getString("COMP_CODE"));
			    baseHedgeTransactionsTO.setTransCode(result.getString("TRANS_CODE"));
			    baseHedgeTransactionsTO.setTransDesc(result.getString("TRANS_DESC"));
			    baseHedgeTransactionsTO.setTransType(result.getString("TRANS_TYPE"));
			    baseHedgeTransactionsTO.setCreateDt(result.getString("CREATE_DT"));
			    baseHedgeTransactionsTO.setCustomer(result.getString("CUSTOMER"));
			    baseHedgeTransactionsTO.setVendor(result.getString("VENDOR"));
			    baseHedgeTransactionsTO.setIntrCompReln(result.getString("INTR_COMP_RELN"));
			    baseHedgeTransactionsTO.setGlAccount(result.getString("GL_ACCOUNT"));
			    baseHedgeTransactionsTO.setGlDesc(result.getString("GL_DESC"));
			    baseHedgeTransactionsTO.setOrderQnty(result.getString("ORDER_QNTY"));
			    baseHedgeTransactionsTO.setUnitsMeasure(result.getString("UNITS_MEASURE"));
			    baseHedgeTransactionsTO.setOrderType1(result.getString("ORDER_TYPE1"));
			    baseHedgeTransactionsTO.setPbCode(result.getString("PB_CODE"));
			    baseHedgeTransactionsTO.setUpdNewOrderQnty(result.getString("UPD_NEW_ORDER_QNTY"));
			    baseHedgeTransactionsTO.setCurrency(result.getString("CURRENCY"));
			    baseHedgeTransactionsTO.setTotalOrderValue(result.getString("TOTAL_ORDER_VALUE"));
			    baseHedgeTransactionsTO.setNewOrderValue(result.getString("NEW_ORDER_VALUE"));
			    baseHedgeTransactionsTO.setReinvMrkup(result.getString("REINV_MRKUP"));
			    baseHedgeTransactionsTO.setNewReinvMrkup(result.getString("NEW_REINV_MRKUP"));
			    baseHedgeTransactionsTO.setSopNum(result.getString("SOP_NUM"));
			    baseHedgeTransactionsTO.setReinvDownld(result.getString("REINV_DOWNLD"));
			    baseHedgeTransactionsTO.setExptDvryArrvDt(result.getString("EXPT_DVRY_ARRV_DT"));
			    baseHedgeTransactionsTO.setPostingDt(result.getString("POSTING_DT"));
			    baseHedgeTransactionsTO.setDueDt(result.getString("DUE_DT"));
			    baseHedgeTransactionsTO.setInitValueFuncCrncy(result.getString("INIT_VALUE_FUNC_CRNCY"));
			    baseHedgeTransactionsTO.setDropShipmtInd(result.getString("DROP_SHIPMT_IND"));
			    baseHedgeTransactionsTO.setOrderType2(result.getString("ORDER_TYPE2"));
			    baseHedgeTransactionsTO.setDelivery(result.getString("DELIVERY"));
			    baseHedgeTransactionsTO.setLocalCrncyKey(result.getString("LOCAL_CRNCY_KEY"));
			    baseHedgeTransactionsTO.setTimeFrmBuckt(result.getString("TIME_FRM_BUCKT"));
			    baseHedgeTransactionsTO.setFinalValueUsed(result.getString("FINAL_VALUE_USED"));
			    baseHedgeTransactionsTO.setReinvInd(result.getString("REINV_IND"));
			    baseHedgeTransactionsTO.setDdFsctStatus(result.getString("DD_FSCT_STATUS"));
			    baseHedgeTransactionsTO.setPackHoldStatus(result.getString("PACK_HOLD_STATUS"));
			    baseHedgeTransactionsTO.setSelRelzdStrtDt(result.getString("SEL_RELZD_STRT_DT"));
			    baseHedgeTransactionsTO.setSelRelzdEndDt(result.getString("SEL_RELZD_END_DT"));
			    baseHedgeTransactionsTO.setSelOpenStrtDt(result.getString("SEL_OPEN_STRT_DT"));
			    baseHedgeTransactionsTO.setSelOpenEndDt(result.getString("SEL_OPEN_END_DT"));
			    baseHedgeTransactionsTO.setNum1633(result.getString("NUM_1633"));
			    baseHedgeTransactionsTO.setMatrlStdPrice(result.getString("MATRL_STD_PRICE"));
			    baseHedgeTransactionsTO.setMatrlActualPrice(result.getString("MATRL_ACTUAL_PRICE"));
			    baseHedgeTransactionsTO.setMatrlOrderPrice(result.getString("MATRL_ORDER_PRICE"));
			    baseHedgeTransactionsTO.setDeliveryMonth(result.getString("DELIVERY_MONTH"));
			    baseHedgeTransactionsTO.setDeliveryYear(result.getString("DELIVERY_YEAR"));
			    baseHedgeTransactionsTO.setDefltUiFlg(result.getString("DEFLT_UI_FLG"));
			    baseHedgeTransactionsTO.setChangeReflectInSap(result.getString("CHANGE_REFLECT_IN_SAP"));
			    baseHedgeTransactionsTO.setRootCauseChange(result.getString("ROOT_CAUSE_CHANGE"));
			    baseHedgeTransactionsTO.setImpactDiscussed(result.getString("IMPACT_DISCUSSED"));
			    baseHedgeTransactionsTO.setExplanation(result.getString("EXPLANATION"));
			    baseHedgeTransactionsTO.setRelvtCompare(result.getString("RELVT_COMPARE"));
			    baseHedgeTransactionsTO.setReinvoicing(result.getString("REINVOICING"));
			    baseHedgeTransactionsTO.setRelvtForOtherCriteria(result.getString("RELVT_FOR_OTHER_CRITERIA"));
			    baseHedgeTransactionsTO.setMatrlDocnum(result.getString("MATRL_DOCNUM"));
			    baseHedgeTransactionsTO.setFocFlag(result.getString("FOC_FLAG"));
			    baseHedgeTransactionsTO.setPlnnrCntryCode(result.getString("PLNNR_CNTRY_CODE"));
			    baseHedgeTransactionsTO.setUpdSopNum(result.getString("UPD_SOP_NUM"));
			    baseHedgeTransactionsTO.setUpdFinalValueUsed(result.getString("UPD_FINAL_VALUE_USED"));
			    baseHedgeTransactionsTO.setUpdNewOrderValue(result.getString("UPD_NEW_ORDER_VALUE"));
			    baseHedgeTransactionsTO.setUpdNewReinvMrkup(result.getString("UPD_NEW_REINV_MRKUP"));
			    baseHedgeTransactionsTO.setUpdInitValueFuncCrncy(result.getString("UPD_INIT_VALUE_FUNC_CRNCY"));
			    baseHedgeTransactionsTO.setFinalValueInEur(result.getString("FINAL_VALUE_IN_EUR"));
			    baseHedgeTransactionsTO.setExchangeRateEur(result.getString("EXCHANGE_RATE_EUR"));
			    baseHedgeTransactionsTO.setWebQty(result.getString("WEB_QTY"));
			    baseHedgeTransactionsTO.setWebComments(result.getString("WEB_COMMENTS"));
			    baseHedgeTransactionsTO.setWebUpdatedBy(result.getString("WEB_UPDATED_BY"));
			    baseHedgeTransactionsTO.setWebUpdatedDate(result.getString("WEB_UPDATED_DATE"));
			    baseHedgeTransactionsTO.setWebValue(result.getString("WEB_VALUE"));
			    baseHedgeTransactionsTO.setWebValueEuro(result.getString("WEB_VALUE_EURO"));
			    baseHedgeTransactionsTO.setWebUpdatedStatus(result.getString("WEB_UPDATED_STATUS"));
			    baseHedgeTransactionsTO.setWebPrice(result.getString("WEB_PRICE"));
			    baseHedgeTransactionsTO.setWebShipStatus(result.getString("WEB_SHIP_STATUS"));
				return baseHedgeTransactionsTO;
		    }
		}, fiscalYear, fiscalMonth, hedgeVersion);
		
		return baseHedgeTransactionsTOList;
		
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.dao.HedgeDAO#getBaseComparisonData(int, int)
	 */
	@Transactional(readOnly=true)
	public List<BaseComparisonDataTO> getBaseComparisonData(int fiscalYear, int fiscalMonth) {
		int baseComparisonDataQueryCount = jdbcTemplate.queryForObject(countBaseComparisonDataQuery, new Object[] { fiscalYear, fiscalMonth }, int.class);
		jdbcTemplate.setFetchSize(baseComparisonDataQueryCount);
		List<BaseComparisonDataTO> baseComparisonDataTOList = jdbcTemplate.query(baseComparisonDataQuery, new RowMapper<BaseComparisonDataTO>() {	
		public BaseComparisonDataTO mapRow(ResultSet result, int rowNum) throws SQLException {
			    BaseComparisonDataTO baseComparisonDataTO = new BaseComparisonDataTO();
			    baseComparisonDataTO.setFiscalMon(result.getString("FISCAL_MON"));
			    baseComparisonDataTO.setFiscalYr(result.getString("FISCAL_YR"));
			    baseComparisonDataTO.setFiscalYrMon(result.getString("FISCAL_YR_MON"));
			    baseComparisonDataTO.setHedgeVersion(result.getString("HEDGE_VERSION"));
			    baseComparisonDataTO.setCountry(result.getString("COUNTRY"));
			    baseComparisonDataTO.setCurrency(result.getString("CURRENCY"));
			    baseComparisonDataTO.setMatrlNo(result.getString("MATRL_NO"));
			    baseComparisonDataTO.setSopFamily(result.getString("SOP_FAMILY"));
			    baseComparisonDataTO.setMatrlDesc(result.getString("MATRL_DESC"));
			    baseComparisonDataTO.setPlnnrCntryCode(result.getString("PLNNR_CNTRY_CODE"));
			    baseComparisonDataTO.setTransType(result.getString("TRANS_TYPE"));
			    baseComparisonDataTO.setDeliveryMonth(result.getString("DELIVERY_MONTH"));
			    baseComparisonDataTO.setDeliveryYear(result.getString("DELIVERY_YEAR"));
			    baseComparisonDataTO.setPrevNewOrderQnty(result.getString("PREV_NEW_ORDER_QNTY"));
			    baseComparisonDataTO.setCurrentNewOrderQnty(result.getString("CURRENT_NEW_ORDER_QNTY"));
			    baseComparisonDataTO.setPrevFinalValueUsed(result.getString("PREV_FINAL_VALUE_USED"));
			    baseComparisonDataTO.setCurrentFinalValueUsed(result.getString("CURRENT_FINAL_VALUE_USED"));
			    baseComparisonDataTO.setWebExplanation(result.getString("WEB_EXPLANATION"));
			    baseComparisonDataTO.setWebImpactDiscussed(result.getString("WEB_IMPACT_DISCUSSED"));
			    baseComparisonDataTO.setWebRootCauseChange(result.getString("WEB_ROOT_CAUSE_CHANGE"));
			    baseComparisonDataTO.setWebChangeReflectInSap(result.getString("WEB_CHANGE_REFLECT_IN_SAP"));
			    baseComparisonDataTO.setWebUpdatedDate(result.getString("WEB_UPDATED_DATE"));
			    baseComparisonDataTO.setWebUpdatedBy(result.getString("WEB_UPDATED_BY"));
			    baseComparisonDataTO.setWebCompUpdatedStatus(result.getString("WEB_COMP_UPDATED_STATUS"));
			    baseComparisonDataTO.setExchangeRateEur(result.getString("EXCHANGE_RATE_EUR"));
			    baseComparisonDataTO.setEurThresholdFlag(result.getString("EUR_THRESHOLD_FLAG"));
			    baseComparisonDataTO.setFinalValueDiffEur(result.getString("FINAL_VALUE_DIFF_EUR"));
			    return baseComparisonDataTO;
		    }
		},fiscalYear, fiscalMonth);
		
		return baseComparisonDataTOList;
	
	}
	
}
