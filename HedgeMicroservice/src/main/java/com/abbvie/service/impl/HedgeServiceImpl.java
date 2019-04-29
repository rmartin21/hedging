package com.abbvie.service.impl;

import java.util.List;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abbvie.dao.HedgeDAO;
import com.abbvie.service.HedgeService;
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
 * The Class HedgeServiceImpl.
 */
@Service
public class HedgeServiceImpl implements HedgeService{
	
	/** The hedge DAO. */
	@Autowired
	HedgeDAO hedgeDAO;

	/**
	 * Gets the profit center details.
	 *
	 * @return the profit center details
	 */
	@Override
	public List<ProfitCenterTO> getProfitCenterDetails() {
		return hedgeDAO.getProfitCenterDetails();
	}
	
	/**
	 * Gets the cost center details.
	 *
	 * @return the cost center details
	 */
	@Override
	public List<CostCenterTO> getCostCenterDetails() {
		return hedgeDAO.getCostCenterDetails();
	}
	
	/**
	 * Gets the document type details.
	 *
	 * @return the document type details
	 */
	@Override
	public List<DocumentTypeTO> getDocumentTypeDetails() {
		return hedgeDAO.getDocumentTypeDetails();
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getPloDetails()
	 */
	@Override
	public List<PloTO> getPloDetails() {
		return hedgeDAO.getPloDetails();
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getFbl1nDetails()
	 */
	@Override
	public List<HistFbl1nTO> getFbl1nDetails() {
		return hedgeDAO.getFbl1nDetails();
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getFbl3nDetails()
	 */
	@Override
	public List<HistFbl3nTO> getFbl3nDetails() {
		return hedgeDAO.getFbl3nDetails();
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getF9i7Details()
	 */
	@Override
	public List<HistF9i7TO> getF9i7Details() {
		return hedgeDAO.getF9i7Details();
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getFbl5nDetails()
	 */
	@Override
	public List<HistFbl5nTO> getFbl5nDetails() {
		return hedgeDAO.getFbl5nDetails();
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getBaseHedgeTransactions(int, int, int)
	 */
	@Override
	public List<BaseHedgeTransactionsTO> getBaseHedgeTransactions(int fiscalYear, int fiscalMonth, int hedgeVersion) {
		return hedgeDAO.getBaseHedgeTransactions(fiscalYear, fiscalMonth, hedgeVersion);
	}
	
	/* (non-Javadoc)
	 * @see com.abbvie.service.HedgeService#getBaseComparisonData(int, int)
	 */
	@Override
	public List<BaseComparisonDataTO> getBaseComparisonData(int fiscalYear, int fiscalMonth) {
		return hedgeDAO.getBaseComparisonData(fiscalYear, fiscalMonth);
	}
	
}
