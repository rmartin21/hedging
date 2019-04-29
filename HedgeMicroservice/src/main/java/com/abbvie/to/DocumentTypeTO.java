package com.abbvie.to;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class DocumentTypeTO.
 */
@Component
public class DocumentTypeTO {
	
	/** The document type. */
	private String documentType;
	
	/** The document desc. */
	private String documentDesc;

	/**
	 * Gets the document type.
	 *
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the document type.
	 *
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * Gets the document desc.
	 *
	 * @return the documentDesc
	 */
	public String getDocumentDesc() {
		return documentDesc;
	}

	/**
	 * Sets the document desc.
	 *
	 * @param documentDesc the documentDesc to set
	 */
	public void setDocumentDesc(String documentDesc) {
		this.documentDesc = documentDesc;
	}
	
	
	
}
