package com.abbvie.microservice;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * The Class HedgeController.
 */
@RestController
@RequestMapping("/hedge")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HedgeController {
	
	/** The hedge service. */
	@Autowired(required=true)
	HedgeService hedgeService;
	
	/**
	 * Gets the profit center details.
	 *	
	 * @return the profit center details
	 */
	@GetMapping(value="/profitcenters", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<ProfitCenterTO> getProfitCenterDetails() {
		List<ProfitCenterTO> ProfitCenterList = hedgeService.getProfitCenterDetails();
		return ProfitCenterList;
	}
	
	/**
	 * Gets the cost center details.
	 *
	 * @return the cost center details
	 */
	@GetMapping(value="/costcenters", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<CostCenterTO> getCostCenterDetails() {
		List<CostCenterTO> costCenterList = hedgeService.getCostCenterDetails();
		return costCenterList;
	}
	
	/**
	 * Gets the packs history.
	 *
	 * @return the packs history
	 */
	@GetMapping(value="/documenttypes", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<DocumentTypeTO> getPacksHistory() {
		List<DocumentTypeTO> documentTypeList = hedgeService.getDocumentTypeDetails();
		return documentTypeList;
	}
	
	/**
	 * Gets the plo details.
	 *
	 * @return the plo details
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/plodetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PloTO> getPloDetails() throws IOException {
		List<PloTO> ploTOList = hedgeService.getPloDetails();
		return ploTOList;
	}
	
	/**
	 * Gets the fbl 1 n details.
	 *
	 * @return the fbl 1 n details
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/fbl1ndetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<HistFbl1nTO> getFbl1nDetails() throws IOException {
		List<HistFbl1nTO> histFbl1nTOList = hedgeService.getFbl1nDetails();
		return histFbl1nTOList;
	}
	
	/**
	 * Gets the fbl 3 n details.
	 *
	 * @return the fbl 3 n details
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/fbl3ndetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<HistFbl3nTO> getFbl3nDetails() throws IOException {
		List<HistFbl3nTO> histFbl3nTOList = hedgeService.getFbl3nDetails();
		return histFbl3nTOList;
	}
	
	/**
	 * Gets the f 9 i 7 details.
	 *
	 * @return the f 9 i 7 details
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/f9i7details", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<HistF9i7TO> getF9i7Details() throws IOException {
		List<HistF9i7TO>  histF9i7TOList = hedgeService.getF9i7Details();
		return histF9i7TOList;
	}
	
	/**
	 * Gets the fbl 5 n details.
	 *
	 * @return the fbl 5 n details
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/fbl5ndetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<HistFbl5nTO> getFbl5nDetails() throws IOException {
		List<HistFbl5nTO>  histFbl5nTOList = hedgeService.getFbl5nDetails();
		return histFbl5nTOList;
	}
	
	/**
	 * Gets the base hedge transactions.
	 *
	 * @param fiscalYear the fiscal year
	 * @param fiscalMonth the fiscal month
	 * @param hedgeVersion the hedge version
	 * @return the base hedge transactions
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/basehedgetransactions/{fiscalYear}/{fiscalMonth}/{hedgeVersion}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BaseHedgeTransactionsTO> getBaseHedgeTransactions(@PathVariable int fiscalYear, @PathVariable int fiscalMonth, @PathVariable int hedgeVersion) throws IOException {
		List<BaseHedgeTransactionsTO> baseHedgeTransactionsTOList = hedgeService.getBaseHedgeTransactions(fiscalYear, fiscalMonth, hedgeVersion);
		return baseHedgeTransactionsTOList;
	}
	
		
	/**
	 * Gets the base comparison data.
	 *
	 * @param fiscalYear the fiscal year
	 * @param fiscalMonth the fiscal month
	 * @return the base comparison data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value="/basecomparisondata/{fiscalYear}/{fiscalMonth}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BaseComparisonDataTO> getBaseComparisonData(@PathVariable int fiscalYear, @PathVariable int fiscalMonth) throws IOException {
		List<BaseComparisonDataTO> baseComparisonDataTOList = hedgeService.getBaseComparisonData(fiscalYear, fiscalMonth);
		return baseComparisonDataTOList;
	}
	
}
