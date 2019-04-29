package com.abbvie.to;

import java.util.Date;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseHedgeTransactionsTO.
 */
@Component
public class BaseHedgeTransactionsTO {
	
	/** The fiscal yr. */
  	private String fiscalYr; 
  	
	/** The fiscal mon. */
  	private String fiscalMon; 
	  
	  /** The fiscal yr mon. */
  	private String fiscalYrMon; 

	  /** The hedge version. */
  	private String hedgeVersion; 

	  /** The hedge version nm. */
  	private String hedgeVersionNm; 

	  /** The doc num. */
  	private String docNum; 

	  /** The item sd. */
  	private String itemSd; 

	  /** The docnum item. */
  	private String docnumItem; 

	  /** The sop family. */
  	private String sopFamily; 

	  /** The matrl no. */
  	private String matrlNo; 

	  /** The matrl desc. */
  	private String matrlDesc; 

	  /** The country. */
  	private String country; 

	  /** The relvt for clrd items. */
  	private String relvtForClrdItems; 

	  /** The total per doc num. */
  	private String totalPerDocNum; 

	  /** The shipment flag. */
  	private String shipmentFlag; 

	  /** The sap seq no. */
  	private String sapSeqNo; 

	  /** The comp code. */
  	private String compCode; 

	  /** The trans code. */
  	private String transCode; 

	  /** The trans desc. */
  	private String transDesc; 

	  /** The trans type. */
  	private String transType; 

	  /** The create dt. */
  	private String createDt; 

	  /** The customer. */
  	private String customer; 

	  /** The vendor. */
  	private String vendor; 

	  /** The intr comp reln. */
  	private String intrCompReln; 

	  /** The gl account. */
  	private String glAccount; 

	  /** The gl desc. */
  	private String glDesc; 

	  /** The order qnty. */
  	private String orderQnty; 

	  /** The units measure. */
  	private String unitsMeasure; 

	  /** The order type 1. */
  	private String orderType1; 

	  /** The pb code. */
  	private String pbCode; 

	  /** The upd new order qnty. */
  	private String updNewOrderQnty; 

	  /** The currency. */
  	private String currency; 

	  /** The total order value. */
  	private String totalOrderValue; 

	  /** The new order value. */
  	private String newOrderValue; 

	  /** The reinv mrkup. */
  	private String reinvMrkup; 

	  /** The new reinv mrkup. */
  	private String newReinvMrkup; 

	  /** The sop num. */
  	private String sopNum; 

	  /** The reinv downld. */
  	private String reinvDownld; 

	  /** The expt dvry arrv dt. */
  	private String exptDvryArrvDt; 

	  /** The posting dt. */
  	private String postingDt; 

	  /** The due dt. */
  	private String dueDt; 

	  /** The init value func crncy. */
  	private String initValueFuncCrncy; 

	  /** The drop shipmt ind. */
  	private String dropShipmtInd; 

	  /** The order type 2. */
  	private String orderType2; 

	  /** The delivery. */
  	private String delivery; 

	  /** The local crncy key. */
  	private String localCrncyKey; 

	  /** The time frm buckt. */
  	private String timeFrmBuckt; 

	  /** The final value used. */
  	private String finalValueUsed; 

	  /** The reinv ind. */
  	private String reinvInd; 

	  /** The dd fsct status. */
  	private String ddFsctStatus; 

	  /** The pack hold status. */
  	private String packHoldStatus; 

	  /** The sel relzd strt dt. */
  	private String selRelzdStrtDt; 

	  /** The sel relzd end dt. */
  	private String selRelzdEndDt; 

	  /** The sel open strt dt. */
  	private String selOpenStrtDt; 

	  /** The sel open end dt. */
  	private String selOpenEndDt; 

	  /** The num 1633. */
  	private String num1633; 

	  /** The matrl std price. */
  	private String matrlStdPrice; 

	  /** The matrl actual price. */
  	private String matrlActualPrice; 

	  /** The matrl order price. */
  	private String matrlOrderPrice; 

	  /** The delivery month. */
  	private String deliveryMonth; 

	  /** The delivery year. */
  	private String deliveryYear; 

	  /** The deflt ui flg. */
  	private String defltUiFlg; 

	  /** The change reflect in sap. */
  	private String changeReflectInSap; 

	  /** The root cause change. */
  	private String rootCauseChange; 

	  /** The impact discussed. */
  	private String impactDiscussed; 

	  /** The explanation. */
  	private String explanation; 

	  /** The relvt compare. */
  	private String relvtCompare; 

	  /** The reinvoicing. */
  	private String reinvoicing; 

	  /** The relvt for other criteria. */
  	private String relvtForOtherCriteria; 

	  /** The matrl docnum. */
  	private String matrlDocnum; 

	  /** The foc flag. */
  	private String focFlag; 

	  /** The plnnr cntry code. */
  	private String plnnrCntryCode; 

	  /** The upd sop num. */
  	private String updSopNum; 

	  /** The upd final value used. */
  	private String updFinalValueUsed; 

	  /** The upd new order value. */
  	private String updNewOrderValue; 

	  /** The upd new reinv mrkup. */
  	private String updNewReinvMrkup; 

	  /** The upd init value func crncy. */
  	private String updInitValueFuncCrncy; 

	  /** The final value in eur. */
  	private String finalValueInEur; 

	  /** The exchange rate eur. */
  	private String exchangeRateEur;

	  /** The web qty. */
  	private String webQty; 

	  /** The web comments. */
  	private String webComments; 

	  /** The web updated by. */
  	private String webUpdatedBy; 

	  /** The web updated date. */
  	private String webUpdatedDate; 

	  /** The web value. */
  	private String webValue; 

	  /** The web value euro. */
  	private String webValueEuro; 

	  /** The web updated status. */
  	private String webUpdatedStatus; 

	  /** The web price. */
  	private String webPrice; 

	  /** The web ship status. */
  	private String webShipStatus;

	/**
	 * @return the fiscalYr
	 */
	public String getFiscalYr() {
		return fiscalYr;
	}

	/**
	 * @param fiscalYr the fiscalYr to set
	 */
	public void setFiscalYr(String fiscalYr) {
		this.fiscalYr = fiscalYr;
	}

	/**
	 * @return the fiscalMon
	 */
	public String getFiscalMon() {
		return fiscalMon;
	}

	/**
	 * @param fiscalMon the fiscalMon to set
	 */
	public void setFiscalMon(String fiscalMon) {
		this.fiscalMon = fiscalMon;
	}

	/**
	 * @return the fiscalYrMon
	 */
	public String getFiscalYrMon() {
		return fiscalYrMon;
	}

	/**
	 * @param fiscalYrMon the fiscalYrMon to set
	 */
	public void setFiscalYrMon(String fiscalYrMon) {
		this.fiscalYrMon = fiscalYrMon;
	}

	/**
	 * @return the hedgeVersion
	 */
	public String getHedgeVersion() {
		return hedgeVersion;
	}

	/**
	 * @param hedgeVersion the hedgeVersion to set
	 */
	public void setHedgeVersion(String hedgeVersion) {
		this.hedgeVersion = hedgeVersion;
	}

	/**
	 * @return the hedgeVersionNm
	 */
	public String getHedgeVersionNm() {
		return hedgeVersionNm;
	}

	/**
	 * @param hedgeVersionNm the hedgeVersionNm to set
	 */
	public void setHedgeVersionNm(String hedgeVersionNm) {
		this.hedgeVersionNm = hedgeVersionNm;
	}

	/**
	 * @return the docNum
	 */
	public String getDocNum() {
		return docNum;
	}

	/**
	 * @param docNum the docNum to set
	 */
	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	/**
	 * @return the itemSd
	 */
	public String getItemSd() {
		return itemSd;
	}

	/**
	 * @param itemSd the itemSd to set
	 */
	public void setItemSd(String itemSd) {
		this.itemSd = itemSd;
	}

	/**
	 * @return the docnumItem
	 */
	public String getDocnumItem() {
		return docnumItem;
	}

	/**
	 * @param docnumItem the docnumItem to set
	 */
	public void setDocnumItem(String docnumItem) {
		this.docnumItem = docnumItem;
	}

	/**
	 * @return the sopFamily
	 */
	public String getSopFamily() {
		return sopFamily;
	}

	/**
	 * @param sopFamily the sopFamily to set
	 */
	public void setSopFamily(String sopFamily) {
		this.sopFamily = sopFamily;
	}

	/**
	 * @return the matrlNo
	 */
	public String getMatrlNo() {
		return matrlNo;
	}

	/**
	 * @param matrlNo the matrlNo to set
	 */
	public void setMatrlNo(String matrlNo) {
		this.matrlNo = matrlNo;
	}

	/**
	 * @return the matrlDesc
	 */
	public String getMatrlDesc() {
		return matrlDesc;
	}

	/**
	 * @param matrlDesc the matrlDesc to set
	 */
	public void setMatrlDesc(String matrlDesc) {
		this.matrlDesc = matrlDesc;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the relvtForClrdItems
	 */
	public String getRelvtForClrdItems() {
		return relvtForClrdItems;
	}

	/**
	 * @param relvtForClrdItems the relvtForClrdItems to set
	 */
	public void setRelvtForClrdItems(String relvtForClrdItems) {
		this.relvtForClrdItems = relvtForClrdItems;
	}

	/**
	 * @return the totalPerDocNum
	 */
	public String getTotalPerDocNum() {
		return totalPerDocNum;
	}

	/**
	 * @param totalPerDocNum the totalPerDocNum to set
	 */
	public void setTotalPerDocNum(String totalPerDocNum) {
		this.totalPerDocNum = totalPerDocNum;
	}

	/**
	 * @return the shipmentFlag
	 */
	public String getShipmentFlag() {
		return shipmentFlag;
	}

	/**
	 * @param shipmentFlag the shipmentFlag to set
	 */
	public void setShipmentFlag(String shipmentFlag) {
		this.shipmentFlag = shipmentFlag;
	}

	/**
	 * @return the sapSeqNo
	 */
	public String getSapSeqNo() {
		return sapSeqNo;
	}

	/**
	 * @param sapSeqNo the sapSeqNo to set
	 */
	public void setSapSeqNo(String sapSeqNo) {
		this.sapSeqNo = sapSeqNo;
	}

	/**
	 * @return the compCode
	 */
	public String getCompCode() {
		return compCode;
	}

	/**
	 * @param compCode the compCode to set
	 */
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

	/**
	 * @return the transCode
	 */
	public String getTransCode() {
		return transCode;
	}

	/**
	 * @param transCode the transCode to set
	 */
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	/**
	 * @return the transDesc
	 */
	public String getTransDesc() {
		return transDesc;
	}

	/**
	 * @param transDesc the transDesc to set
	 */
	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}

	/**
	 * @return the transType
	 */
	public String getTransType() {
		return transType;
	}

	/**
	 * @param transType the transType to set
	 */
	public void setTransType(String transType) {
		this.transType = transType;
	}

	/**
	 * @return the createDt
	 */
	public String getCreateDt() {
		return createDt;
	}

	/**
	 * @param createDt the createDt to set
	 */
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * @return the intrCompReln
	 */
	public String getIntrCompReln() {
		return intrCompReln;
	}

	/**
	 * @param intrCompReln the intrCompReln to set
	 */
	public void setIntrCompReln(String intrCompReln) {
		this.intrCompReln = intrCompReln;
	}

	/**
	 * @return the glAccount
	 */
	public String getGlAccount() {
		return glAccount;
	}

	/**
	 * @param glAccount the glAccount to set
	 */
	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}

	/**
	 * @return the glDesc
	 */
	public String getGlDesc() {
		return glDesc;
	}

	/**
	 * @param glDesc the glDesc to set
	 */
	public void setGlDesc(String glDesc) {
		this.glDesc = glDesc;
	}

	/**
	 * @return the orderQnty
	 */
	public String getOrderQnty() {
		return orderQnty;
	}

	/**
	 * @param orderQnty the orderQnty to set
	 */
	public void setOrderQnty(String orderQnty) {
		this.orderQnty = orderQnty;
	}

	/**
	 * @return the unitsMeasure
	 */
	public String getUnitsMeasure() {
		return unitsMeasure;
	}

	/**
	 * @param unitsMeasure the unitsMeasure to set
	 */
	public void setUnitsMeasure(String unitsMeasure) {
		this.unitsMeasure = unitsMeasure;
	}

	/**
	 * @return the orderType1
	 */
	public String getOrderType1() {
		return orderType1;
	}

	/**
	 * @param orderType1 the orderType1 to set
	 */
	public void setOrderType1(String orderType1) {
		this.orderType1 = orderType1;
	}

	/**
	 * @return the pbCode
	 */
	public String getPbCode() {
		return pbCode;
	}

	/**
	 * @param pbCode the pbCode to set
	 */
	public void setPbCode(String pbCode) {
		this.pbCode = pbCode;
	}

	/**
	 * @return the updNewOrderQnty
	 */
	public String getUpdNewOrderQnty() {
		return updNewOrderQnty;
	}

	/**
	 * @param updNewOrderQnty the updNewOrderQnty to set
	 */
	public void setUpdNewOrderQnty(String updNewOrderQnty) {
		this.updNewOrderQnty = updNewOrderQnty;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the totalOrderValue
	 */
	public String getTotalOrderValue() {
		return totalOrderValue;
	}

	/**
	 * @param totalOrderValue the totalOrderValue to set
	 */
	public void setTotalOrderValue(String totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	/**
	 * @return the newOrderValue
	 */
	public String getNewOrderValue() {
		return newOrderValue;
	}

	/**
	 * @param newOrderValue the newOrderValue to set
	 */
	public void setNewOrderValue(String newOrderValue) {
		this.newOrderValue = newOrderValue;
	}

	/**
	 * @return the reinvMrkup
	 */
	public String getReinvMrkup() {
		return reinvMrkup;
	}

	/**
	 * @param reinvMrkup the reinvMrkup to set
	 */
	public void setReinvMrkup(String reinvMrkup) {
		this.reinvMrkup = reinvMrkup;
	}

	/**
	 * @return the newReinvMrkup
	 */
	public String getNewReinvMrkup() {
		return newReinvMrkup;
	}

	/**
	 * @param newReinvMrkup the newReinvMrkup to set
	 */
	public void setNewReinvMrkup(String newReinvMrkup) {
		this.newReinvMrkup = newReinvMrkup;
	}

	/**
	 * @return the sopNum
	 */
	public String getSopNum() {
		return sopNum;
	}

	/**
	 * @param sopNum the sopNum to set
	 */
	public void setSopNum(String sopNum) {
		this.sopNum = sopNum;
	}

	/**
	 * @return the reinvDownld
	 */
	public String getReinvDownld() {
		return reinvDownld;
	}

	/**
	 * @param reinvDownld the reinvDownld to set
	 */
	public void setReinvDownld(String reinvDownld) {
		this.reinvDownld = reinvDownld;
	}

	/**
	 * @return the exptDvryArrvDt
	 */
	public String getExptDvryArrvDt() {
		return exptDvryArrvDt;
	}

	/**
	 * @param exptDvryArrvDt the exptDvryArrvDt to set
	 */
	public void setExptDvryArrvDt(String exptDvryArrvDt) {
		this.exptDvryArrvDt = exptDvryArrvDt;
	}

	/**
	 * @return the postingDt
	 */
	public String getPostingDt() {
		return postingDt;
	}

	/**
	 * @param postingDt the postingDt to set
	 */
	public void setPostingDt(String postingDt) {
		this.postingDt = postingDt;
	}

	/**
	 * @return the dueDt
	 */
	public String getDueDt() {
		return dueDt;
	}

	/**
	 * @param dueDt the dueDt to set
	 */
	public void setDueDt(String dueDt) {
		this.dueDt = dueDt;
	}

	/**
	 * @return the initValueFuncCrncy
	 */
	public String getInitValueFuncCrncy() {
		return initValueFuncCrncy;
	}

	/**
	 * @param initValueFuncCrncy the initValueFuncCrncy to set
	 */
	public void setInitValueFuncCrncy(String initValueFuncCrncy) {
		this.initValueFuncCrncy = initValueFuncCrncy;
	}

	/**
	 * @return the dropShipmtInd
	 */
	public String getDropShipmtInd() {
		return dropShipmtInd;
	}

	/**
	 * @param dropShipmtInd the dropShipmtInd to set
	 */
	public void setDropShipmtInd(String dropShipmtInd) {
		this.dropShipmtInd = dropShipmtInd;
	}

	/**
	 * @return the orderType2
	 */
	public String getOrderType2() {
		return orderType2;
	}

	/**
	 * @param orderType2 the orderType2 to set
	 */
	public void setOrderType2(String orderType2) {
		this.orderType2 = orderType2;
	}

	/**
	 * @return the delivery
	 */
	public String getDelivery() {
		return delivery;
	}

	/**
	 * @param delivery the delivery to set
	 */
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	/**
	 * @return the localCrncyKey
	 */
	public String getLocalCrncyKey() {
		return localCrncyKey;
	}

	/**
	 * @param localCrncyKey the localCrncyKey to set
	 */
	public void setLocalCrncyKey(String localCrncyKey) {
		this.localCrncyKey = localCrncyKey;
	}

	/**
	 * @return the timeFrmBuckt
	 */
	public String getTimeFrmBuckt() {
		return timeFrmBuckt;
	}

	/**
	 * @param timeFrmBuckt the timeFrmBuckt to set
	 */
	public void setTimeFrmBuckt(String timeFrmBuckt) {
		this.timeFrmBuckt = timeFrmBuckt;
	}

	/**
	 * @return the finalValueUsed
	 */
	public String getFinalValueUsed() {
		return finalValueUsed;
	}

	/**
	 * @param finalValueUsed the finalValueUsed to set
	 */
	public void setFinalValueUsed(String finalValueUsed) {
		this.finalValueUsed = finalValueUsed;
	}

	/**
	 * @return the reinvInd
	 */
	public String getReinvInd() {
		return reinvInd;
	}

	/**
	 * @param reinvInd the reinvInd to set
	 */
	public void setReinvInd(String reinvInd) {
		this.reinvInd = reinvInd;
	}

	/**
	 * @return the ddFsctStatus
	 */
	public String getDdFsctStatus() {
		return ddFsctStatus;
	}

	/**
	 * @param ddFsctStatus the ddFsctStatus to set
	 */
	public void setDdFsctStatus(String ddFsctStatus) {
		this.ddFsctStatus = ddFsctStatus;
	}

	/**
	 * @return the packHoldStatus
	 */
	public String getPackHoldStatus() {
		return packHoldStatus;
	}

	/**
	 * @param packHoldStatus the packHoldStatus to set
	 */
	public void setPackHoldStatus(String packHoldStatus) {
		this.packHoldStatus = packHoldStatus;
	}

	/**
	 * @return the selRelzdStrtDt
	 */
	public String getSelRelzdStrtDt() {
		return selRelzdStrtDt;
	}

	/**
	 * @param selRelzdStrtDt the selRelzdStrtDt to set
	 */
	public void setSelRelzdStrtDt(String selRelzdStrtDt) {
		this.selRelzdStrtDt = selRelzdStrtDt;
	}

	/**
	 * @return the selRelzdEndDt
	 */
	public String getSelRelzdEndDt() {
		return selRelzdEndDt;
	}

	/**
	 * @param selRelzdEndDt the selRelzdEndDt to set
	 */
	public void setSelRelzdEndDt(String selRelzdEndDt) {
		this.selRelzdEndDt = selRelzdEndDt;
	}

	/**
	 * @return the selOpenStrtDt
	 */
	public String getSelOpenStrtDt() {
		return selOpenStrtDt;
	}

	/**
	 * @param selOpenStrtDt the selOpenStrtDt to set
	 */
	public void setSelOpenStrtDt(String selOpenStrtDt) {
		this.selOpenStrtDt = selOpenStrtDt;
	}

	/**
	 * @return the selOpenEndDt
	 */
	public String getSelOpenEndDt() {
		return selOpenEndDt;
	}

	/**
	 * @param selOpenEndDt the selOpenEndDt to set
	 */
	public void setSelOpenEndDt(String selOpenEndDt) {
		this.selOpenEndDt = selOpenEndDt;
	}

	/**
	 * @return the num1633
	 */
	public String getNum1633() {
		return num1633;
	}

	/**
	 * @param num1633 the num1633 to set
	 */
	public void setNum1633(String num1633) {
		this.num1633 = num1633;
	}

	/**
	 * @return the matrlStdPrice
	 */
	public String getMatrlStdPrice() {
		return matrlStdPrice;
	}

	/**
	 * @param matrlStdPrice the matrlStdPrice to set
	 */
	public void setMatrlStdPrice(String matrlStdPrice) {
		this.matrlStdPrice = matrlStdPrice;
	}

	/**
	 * @return the matrlActualPrice
	 */
	public String getMatrlActualPrice() {
		return matrlActualPrice;
	}

	/**
	 * @param matrlActualPrice the matrlActualPrice to set
	 */
	public void setMatrlActualPrice(String matrlActualPrice) {
		this.matrlActualPrice = matrlActualPrice;
	}

	/**
	 * @return the matrlOrderPrice
	 */
	public String getMatrlOrderPrice() {
		return matrlOrderPrice;
	}

	/**
	 * @param matrlOrderPrice the matrlOrderPrice to set
	 */
	public void setMatrlOrderPrice(String matrlOrderPrice) {
		this.matrlOrderPrice = matrlOrderPrice;
	}

	/**
	 * @return the deliveryMonth
	 */
	public String getDeliveryMonth() {
		return deliveryMonth;
	}

	/**
	 * @param deliveryMonth the deliveryMonth to set
	 */
	public void setDeliveryMonth(String deliveryMonth) {
		this.deliveryMonth = deliveryMonth;
	}

	/**
	 * @return the deliveryYear
	 */
	public String getDeliveryYear() {
		return deliveryYear;
	}

	/**
	 * @param deliveryYear the deliveryYear to set
	 */
	public void setDeliveryYear(String deliveryYear) {
		this.deliveryYear = deliveryYear;
	}

	/**
	 * @return the defltUiFlg
	 */
	public String getDefltUiFlg() {
		return defltUiFlg;
	}

	/**
	 * @param defltUiFlg the defltUiFlg to set
	 */
	public void setDefltUiFlg(String defltUiFlg) {
		this.defltUiFlg = defltUiFlg;
	}

	/**
	 * @return the changeReflectInSap
	 */
	public String getChangeReflectInSap() {
		return changeReflectInSap;
	}

	/**
	 * @param changeReflectInSap the changeReflectInSap to set
	 */
	public void setChangeReflectInSap(String changeReflectInSap) {
		this.changeReflectInSap = changeReflectInSap;
	}

	/**
	 * @return the rootCauseChange
	 */
	public String getRootCauseChange() {
		return rootCauseChange;
	}

	/**
	 * @param rootCauseChange the rootCauseChange to set
	 */
	public void setRootCauseChange(String rootCauseChange) {
		this.rootCauseChange = rootCauseChange;
	}

	/**
	 * @return the impactDiscussed
	 */
	public String getImpactDiscussed() {
		return impactDiscussed;
	}

	/**
	 * @param impactDiscussed the impactDiscussed to set
	 */
	public void setImpactDiscussed(String impactDiscussed) {
		this.impactDiscussed = impactDiscussed;
	}

	/**
	 * @return the explanation
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * @param explanation the explanation to set
	 */
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	/**
	 * @return the relvtCompare
	 */
	public String getRelvtCompare() {
		return relvtCompare;
	}

	/**
	 * @param relvtCompare the relvtCompare to set
	 */
	public void setRelvtCompare(String relvtCompare) {
		this.relvtCompare = relvtCompare;
	}

	/**
	 * @return the reinvoicing
	 */
	public String getReinvoicing() {
		return reinvoicing;
	}

	/**
	 * @param reinvoicing the reinvoicing to set
	 */
	public void setReinvoicing(String reinvoicing) {
		this.reinvoicing = reinvoicing;
	}

	/**
	 * @return the relvtForOtherCriteria
	 */
	public String getRelvtForOtherCriteria() {
		return relvtForOtherCriteria;
	}

	/**
	 * @param relvtForOtherCriteria the relvtForOtherCriteria to set
	 */
	public void setRelvtForOtherCriteria(String relvtForOtherCriteria) {
		this.relvtForOtherCriteria = relvtForOtherCriteria;
	}

	/**
	 * @return the matrlDocnum
	 */
	public String getMatrlDocnum() {
		return matrlDocnum;
	}

	/**
	 * @param matrlDocnum the matrlDocnum to set
	 */
	public void setMatrlDocnum(String matrlDocnum) {
		this.matrlDocnum = matrlDocnum;
	}

	/**
	 * @return the focFlag
	 */
	public String getFocFlag() {
		return focFlag;
	}

	/**
	 * @param focFlag the focFlag to set
	 */
	public void setFocFlag(String focFlag) {
		this.focFlag = focFlag;
	}

	/**
	 * @return the plnnrCntryCode
	 */
	public String getPlnnrCntryCode() {
		return plnnrCntryCode;
	}

	/**
	 * @param plnnrCntryCode the plnnrCntryCode to set
	 */
	public void setPlnnrCntryCode(String plnnrCntryCode) {
		this.plnnrCntryCode = plnnrCntryCode;
	}

	/**
	 * @return the updSopNum
	 */
	public String getUpdSopNum() {
		return updSopNum;
	}

	/**
	 * @param updSopNum the updSopNum to set
	 */
	public void setUpdSopNum(String updSopNum) {
		this.updSopNum = updSopNum;
	}

	/**
	 * @return the updFinalValueUsed
	 */
	public String getUpdFinalValueUsed() {
		return updFinalValueUsed;
	}

	/**
	 * @param updFinalValueUsed the updFinalValueUsed to set
	 */
	public void setUpdFinalValueUsed(String updFinalValueUsed) {
		this.updFinalValueUsed = updFinalValueUsed;
	}

	/**
	 * @return the updNewOrderValue
	 */
	public String getUpdNewOrderValue() {
		return updNewOrderValue;
	}

	/**
	 * @param updNewOrderValue the updNewOrderValue to set
	 */
	public void setUpdNewOrderValue(String updNewOrderValue) {
		this.updNewOrderValue = updNewOrderValue;
	}

	/**
	 * @return the updNewReinvMrkup
	 */
	public String getUpdNewReinvMrkup() {
		return updNewReinvMrkup;
	}

	/**
	 * @param updNewReinvMrkup the updNewReinvMrkup to set
	 */
	public void setUpdNewReinvMrkup(String updNewReinvMrkup) {
		this.updNewReinvMrkup = updNewReinvMrkup;
	}

	/**
	 * @return the updInitValueFuncCrncy
	 */
	public String getUpdInitValueFuncCrncy() {
		return updInitValueFuncCrncy;
	}

	/**
	 * @param updInitValueFuncCrncy the updInitValueFuncCrncy to set
	 */
	public void setUpdInitValueFuncCrncy(String updInitValueFuncCrncy) {
		this.updInitValueFuncCrncy = updInitValueFuncCrncy;
	}

	/**
	 * @return the finalValueInEur
	 */
	public String getFinalValueInEur() {
		return finalValueInEur;
	}

	/**
	 * @param finalValueInEur the finalValueInEur to set
	 */
	public void setFinalValueInEur(String finalValueInEur) {
		this.finalValueInEur = finalValueInEur;
	}

	/**
	 * @return the exchangeRateEur
	 */
	public String getExchangeRateEur() {
		return exchangeRateEur;
	}

	/**
	 * @param exchangeRateEur the exchangeRateEur to set
	 */
	public void setExchangeRateEur(String exchangeRateEur) {
		this.exchangeRateEur = exchangeRateEur;
	}

	/**
	 * @return the webQty
	 */
	public String getWebQty() {
		return webQty;
	}

	/**
	 * @param webQty the webQty to set
	 */
	public void setWebQty(String webQty) {
		this.webQty = webQty;
	}

	/**
	 * @return the webComments
	 */
	public String getWebComments() {
		return webComments;
	}

	/**
	 * @param webComments the webComments to set
	 */
	public void setWebComments(String webComments) {
		this.webComments = webComments;
	}

	/**
	 * @return the webUpdatedBy
	 */
	public String getWebUpdatedBy() {
		return webUpdatedBy;
	}

	/**
	 * @param webUpdatedBy the webUpdatedBy to set
	 */
	public void setWebUpdatedBy(String webUpdatedBy) {
		this.webUpdatedBy = webUpdatedBy;
	}

	/**
	 * @return the webUpdatedDate
	 */
	public String getWebUpdatedDate() {
		return webUpdatedDate;
	}

	/**
	 * @param webUpdatedDate the webUpdatedDate to set
	 */
	public void setWebUpdatedDate(String webUpdatedDate) {
		this.webUpdatedDate = webUpdatedDate;
	}

	/**
	 * @return the webValue
	 */
	public String getWebValue() {
		return webValue;
	}

	/**
	 * @param webValue the webValue to set
	 */
	public void setWebValue(String webValue) {
		this.webValue = webValue;
	}

	/**
	 * @return the webValueEuro
	 */
	public String getWebValueEuro() {
		return webValueEuro;
	}

	/**
	 * @param webValueEuro the webValueEuro to set
	 */
	public void setWebValueEuro(String webValueEuro) {
		this.webValueEuro = webValueEuro;
	}

	/**
	 * @return the webUpdatedStatus
	 */
	public String getWebUpdatedStatus() {
		return webUpdatedStatus;
	}

	/**
	 * @param webUpdatedStatus the webUpdatedStatus to set
	 */
	public void setWebUpdatedStatus(String webUpdatedStatus) {
		this.webUpdatedStatus = webUpdatedStatus;
	}

	/**
	 * @return the webPrice
	 */
	public String getWebPrice() {
		return webPrice;
	}

	/**
	 * @param webPrice the webPrice to set
	 */
	public void setWebPrice(String webPrice) {
		this.webPrice = webPrice;
	}

	/**
	 * @return the webShipStatus
	 */
	public String getWebShipStatus() {
		return webShipStatus;
	}

	/**
	 * @param webShipStatus the webShipStatus to set
	 */
	public void setWebShipStatus(String webShipStatus) {
		this.webShipStatus = webShipStatus;
	}
  	
	
}
