package com.abbvie.service;

import java.util.List;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

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
 * The Interface HedgeService.
 */
public interface HedgeService {
	
	/**
	 * Gets the profit center details.
	 *
	 * @return the profit center details
	 */
	public List<ProfitCenterTO> getProfitCenterDetails();
	
	/**
	 * Gets the cost center details.
	 *
	 * @return the cost center details
	 */
	public List<CostCenterTO> getCostCenterDetails();
	
	/**
	 * Gets the document type details.
	 *
	 * @return the document type details
	 */
	public List<DocumentTypeTO> getDocumentTypeDetails();
	
	/**
	 * Gets the plo details.
	 *
	 * @return the plo details
	 */
	public List<PloTO> getPloDetails();
	
	/**
	 * Gets the fbl 1 n details.
	 *
	 * @return the fbl 1 n details
	 */
	public List<HistFbl1nTO> getFbl1nDetails();
	
	/**
	 * Gets the fbl 3 n details.
	 *
	 * @return the fbl 3 n details
	 */
	public List<HistFbl3nTO> getFbl3nDetails();
	
	/**
	 * Gets the f 9 i 7 details.
	 *
	 * @return the f 9 i 7 details
	 */
	public List<HistF9i7TO> getF9i7Details();
	
	/**
	 * Gets the fbl 5 n details.
	 *
	 * @return the fbl 5 n details
	 */
	public List<HistFbl5nTO> getFbl5nDetails();
	
	/**
	 * Gets the base hedge transactions.
	 *
	 * @param fiscalYear the fiscal year
	 * @param fiscalMonth the fiscal month
	 * @param hedgeVersion the hedge version
	 * @return the base hedge transactions
	 */
	public List<BaseHedgeTransactionsTO> getBaseHedgeTransactions(int fiscalYear, int fiscalMonth, int hedgeVersion);
	
	/**
	 * Gets the base comparison data.
	 *
	 * @param fiscalYear the fiscal year
	 * @param fiscalMonth the fiscal month
	 * @return the base comparison data
	 */
	public List<BaseComparisonDataTO> getBaseComparisonData(int fiscalYear, int fiscalMonth);
	
}
