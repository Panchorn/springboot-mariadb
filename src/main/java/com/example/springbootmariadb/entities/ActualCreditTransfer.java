package com.example.springbootmariadb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Table(name = "actual_credit_transfer")
public class ActualCreditTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACTR_SEQ_ID")
    private Long actrSeqId;

    @Column(name = "ACTR_TXN_REF_ID", nullable = false, length = 20)
    private String actrTxnRefId;

    @Column(name = "ACTR_REQ_CHANNEL", nullable = false, length = 30)
    private String actrReqChannel;

    @Column(name = "ACTR_REQ_BY", nullable = false, length = 20)
    private String actrReqBy;

    @Column(name = "ACTR_REQ_DTM", columnDefinition = "TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3)")
    private Timestamp actrReqDtm;

    @Column(name = "ACTR_REQ_ID", nullable = false, length = 30)
    private String actrReqId;

    @Column(name = "ACTR_FROM_ACCT_ID", nullable = false, length = 20)
    private String actrFromAcctId;

    @Column(name = "ACTR_FROM_ACCT_TYPE", length = 10)
    private String actrFromAcctType;

    @Column(name = "ACTR_FROM_ACCT_STATUS", precision = 2)
    private Integer actrFromAcctStatus;

    @Column(name = "ACTR_TO_ACCT_ID", length = 100)
    private String actrToAcctId;

    @Column(name = "ACTR_TO_BANK_CD", length = 10)
    private String actrToBankCd;

    @Column(name = "ACTR_TO_ACCT_NAME", length = 160)
    private String actrToAcctName;

    @Column(name = "ACTR_TO_DISPLAY_NAME", length = 50)
    private String actrToDisplayName;

    @Column(name = "ACTR_AMT", nullable = false, precision = 17, scale = 2)
    private BigDecimal actrAmt;

    @Column(name = "ACTR_ISSUER_FEE_AMT", precision = 10, scale = 2)
    private BigDecimal actrIssuerFeeAmt;

    @Column(name = "ACTR_ACQUIRER_FEE_AMT", precision = 10, scale = 2)
    private BigDecimal actrAcquirerFeeAmt;

    @Column(name = "ACTR_BENEFICIARY_FEE_AMT", precision = 10, scale = 2)
    private BigDecimal actrBeneficiaryFeeAmt;

    @Column(name = "ACTR_TOTAL_FEE_AMT", precision = 10, scale = 2)
    private BigDecimal actrTotalFeeAmt;

    @Column(name = "ACTR_TFR_DTM", columnDefinition = "TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3)")
    private Timestamp actrTfrDtm;

    @Column(name = "ACTR_STATUS", nullable = false, length = 10)
    private String actrStatus;

    @Column(name = "ACTR_STATUS_CD", length = 10)
    private String actrStatusCd;

    @Column(name = "ACTR_STATUS_DESC", length = 200)
    private String actrStatusDesc;

    @Column(name = "ACTR_TFR_REF_NO", length = 20)
    private String actrTfrRefNo;

    @Column(name = "ACTR_CREAT_DTM", columnDefinition = "TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3)")
    private Timestamp actrCreatDtm;

    @Column(name = "ACTR_UPDAT_DTM", columnDefinition = "TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3)")
    private Timestamp actrUpdatDtm;

    @Column(name = "ACTR_RETRY_DTM", columnDefinition = "TIMESTAMP(3) DEFAULT CURRENT_TIMESTAMP(3)")
    private Timestamp actrRetryDtm;

    @Column(name = "ACTR_RET_REF_NO", nullable = false, length = 20)
    private String actrRetRefNo;

    @Column(name = "ACTR_RET_REF_NO_EXPIRE", columnDefinition = "TIMESTAMP DEFAULT '0000-00-00 00:00:00'")
    private Timestamp actrRetRefNoExpire;

    @Column(name = "ACTR_COMMENTS", length = 100)
    private String actrComments;

    @Column(name = "ACTR_FROM_ACCT_NAME", nullable = false, length = 64)
    private String actrFromAcctName;

    @Column(name = "ACTR_FROM_DISPLAY_NAME", nullable = false, length = 50)
    private String actrFromDisplayName;

    @Column(name = "ACTR_FROM_BRANCH_CODE", nullable = false, length = 10)
    private String actrFromBranchCode;

    @Column(name = "ACTR_FROM_CURR_CD", nullable = false, length = 10)
    private String actrFromCurrCd;

    @Column(name = "ACTR_FROM_PROV_CD", nullable = false, length = 10)
    private String actrFromProvCd;

    @Column(name = "ACTR_FROM_COUNTRY_CD", nullable = false, length = 10)
    private String actrFromCountryCd;

    @Column(name = "ACTR_FROM_CIF_NO", nullable = false, length = 12)
    private String actrFromCifNo;

    @Column(name = "ACTR_TO_ACCT_TYPE", length = 10)
    private String actrToAcctType;

    @Column(name = "ACTR_TERMINAL_ID", length = 16)
    private String actrTerminalId;

    @Column(name = "ACTR_PAN_ID", precision = 19)
    private Long actrPanId;

    @Column(name = "ACTR_RECIPT_NO", precision = 6)
    private Integer actrReciptNo;

    @Column(name = "ACTR_TRANS_TIME", precision = 6)
    private Integer actrTransTime;

    @Column(name = "ACTR_TRANS_TYPE", precision = 6)
    private Integer actrTransType;

    @Column(name = "ACTR_LOCATION_CD", precision = 2)
    private Integer actrLocationCd;

    @Column(name = "ACTR_FROM_BRANCH_OWNER", precision = 6)
    private Integer actrFromBranchOwner;

    @Column(name = "ACTR_MSG_TYPE", precision = 4)
    private Integer actrMsgType;

    @Column(name = "ACTR_FROM_TAX_ID", length = 20)
    private String actrFromTaxId;

    @Column(name = "ACTR_EFF_DATE")
    private Date actrEffDate;

    @Column(name = "ACTR_SETTLEMENT_DATE", length = 4)
    private String actrSettlementDate;

    @Column(name = "ACTR_RECEIVER_TAX_ID", length = 13)
    private String actrReceiverTaxId;

    @Column(name = "ACTR_RECEIVER_BANK_BRANCH_CD", length = 6)
    private String actrReceiverBankBranchCd;

    @Column(name = "ACTR_RECEIVER_TYPE", length = 1)
    private Character actrReceiverType;

    @Column(name = "ACTR_INPUT_TERMINAL", length = 100)
    private String actrInputTerminal;

    @Column(name = "ACTR_OVERRIDE_FEE_AMT", precision = 10, scale = 2)
    private BigDecimal actrOverrideFeeAmt;

    @Column(name = "ACTR_RETRY_CNT")
    private Integer actrRetryCnt;

    @Column(name = "ACTR_LOOKUP_SERVER_NAME", length = 200)
    private String actrLookupServerName;

    @Column(name = "ACTR_TFR_SERVER_NAME", length = 200)
    private String actrTfrServerName;

    @Column(name = "ACTR_MQ_SERVER_NAME", length = 200)
    private String actrMqServerName;

    @Column(name = "ACTR_SENDER_TYPE", length = 1)
    private Character actrSenderType;

    @Column(name = "ACTR_FROM_REAL_ACCT_ID", length = 20)
    private String actrFromRealAcctId;

    @Column(name = "ACTR_FROM_REAL_BRANCH_ID", length = 10)
    private String actrFromRealBranchId;

    @Column(name = "ACTR_FROM_REAL_CIF_ID", length = 12)
    private String actrFromRealCifId;

    @Column(name = "ACTR_FROM_ACCOUNT_CLASS", length = 1)
    private Character actrFromAccountClass;

    @Column(name = "ACTR_TO_ACCOUNT_CLASS", length = 1)
    private Character actrToAccountClass;

    @Column(name = "ACTR_DEBIT_FEE_ACCOUNT1", length = 12)
    private String actrDebitFeeAccount1;

    @Column(name = "ACTR_DEBIT_FEE_ACCOUNT1CLASS", length = 1)
    private Character actrDebitFeeAccount1class;

    @Column(name = "ACTR_DEBIT_FEE_ACCOUNT2", length = 12)
    private String actrDebitFeeAccount2;

    @Column(name = "ACTR_DEBIT_FEE_ACCOUNT2CLASS", length = 1)
    private Character actrDebitFeeAccount2class;

    @Column(name = "ACTR_CREDIT_ACQ_FEE_ACCOUNT", length = 12)
    private String actrCreditAcqFeeAccount;

    @Column(name = "ACTR_CREDIT_ACQ_FEE_ACCOUNTCLASS", length = 1)
    private Character actrCreditAcqFeeAccountclass;

    @Column(name = "ACTR_CREDIT_ISSUER_FEE_ACCOUNT", length = 12)
    private String actrCreditIssuerFeeAccount;

    @Column(name = "ACTR_CREDIT_ISSUER_FEE_ACCOUNTCLASS", length = 1)
    private Character actrCreditIssuerFeeAccountclass;

    @Column(name = "ACTR_CREDIT_TOAC_FEE_ACCOUNT", length = 12)
    private String actrCreditToacFeeAccount;

    @Column(name = "ACTR_CREDIT_TOAC_FEE_ACCOUNTCLASS", length = 1)
    private Character actrCreditToacFeeAccountclass;

    @Column(name = "ACTR_CREDIT_FEE_ACCOUNT2", length = 12)
    private String actrCreditFeeAccount2;

    @Column(name = "ACTR_CREDIT_FEE_ACCOUNT2CLASS", length = 1)
    private Character actrCreditFeeAccount2class;

    @Column(name = "ACTR_DEBIT_FEE_AMOUNT1", precision = 17, scale = 2)
    private BigDecimal actrDebitFeeAmount1;

    @Column(name = "ACTR_CREDIT_ACQ_FEE_AMOUNT", precision = 17, scale = 2)
    private BigDecimal actrCreditAcqFeeAmount;

    @Column(name = "ACTR_CREDIT_ISSUER_FEE_AMOUNT", precision = 17, scale = 2)
    private BigDecimal actrCreditIssuerFeeAmount;

    @Column(name = "ACTR_CREDIT_TOAC_FEE_AMOUNT", precision = 17, scale = 2)
    private BigDecimal actrCreditToacFeeAmount;

    @Column(name = "ACTR_FEE2_AMOUNT", precision = 17, scale = 2)
    private BigDecimal actrFee2Amount;

    @Column(name = "ACTR_TRANS_COSTCENTER", length = 6)
    private String actrTransCostcenter;

    @Column(name = "ACTR_DEBIT_FEE_COSTCENTER1", length = 6)
    private String actrDebitFeeCostcenter1;

    @Column(name = "ACTR_DEBIT_FEE_COSTCENTER2", length = 6)
    private String actrDebitFeeCostcenter2;

    @Column(name = "ACTR_CREDIT_ACQ_FEE_COSTCENTER", length = 6)
    private String actrCreditAcqFeeCostcenter;

    @Column(name = "ACTR_CREDIT_ISSUER_FEE_COSTCENTER", length = 6)
    private String actrCreditIssuerFeeCostcenter;

    @Column(name = "ACTR_CREDIT_TOACC_FEE_COSTCENTER", length = 6)
    private String actrCreditToaccFeeCostcenter;

    @Column(name = "ACTR_CREDIT_FEE_COSTCENTER2", length = 6)
    private String actrCreditFeeCostcenter2;

    @Column(name = "ACTR_TRANS_COMMENT", length = 100)
    private String actrTransComment;

    @Column(name = "ACTR_DEBIT_FEE_COMMENT", length = 100)
    private String actrDebitFeeComment;

    @Column(name = "ACTR_CREDIT_ACQ_FEE_COMMENT", length = 100)
    private String actrCreditAcqFeeComment;

    @Column(name = "ACTR_CREDIT_ISSUER_FEE_COMMENT", length = 100)
    private String actrCreditIssuerFeeComment;

    @Column(name = "ACTR_CREDIT_TOACC_FEE_COMMENT", length = 100)
    private String actrCreditToaccFeeComment;

    @Column(name = "ACTR_FEE2_COMMENT", length = 100)
    private String actrFee2Comment;

}

/*
Data sample
{
  "actrSeqId": 12346,
  "actrTxnRefId": "TXN1234567890",
  "actrReqChannel": "MobileApp",
  "actrReqBy": "user123",
  "actrReqDtm": "2023-10-04T10:15:30.123",
  "actrReqId": "REQ1234567890",
  "actrFromAcctId": "ACC1234567890",
  "actrFromAcctType": "SAV",
  "actrFromAcctStatus": 1,
  "actrToAcctId": "ACC0987654321",
  "actrToBankCd": "BANK01",
  "actrToAcctName": "John Doe",
  "actrToDisplayName": "John",
  "actrAmt": 1500.75,
  "actrIssuerFeeAmt": 15.00,
  "actrAcquirerFeeAmt": 10.00,
  "actrBeneficiaryFeeAmt": 5.00,
  "actrTotalFeeAmt": 30.00,
  "actrTfrDtm": "2023-10-04T10:20:30.123",
  "actrStatus": "SUCCESS",
  "actrStatusCd": "00",
  "actrStatusDesc": "Transaction Successful",
  "actrTfrRefNo": "TFR1234567890",
  "actrCreatDtm": "2023-10-04T10:15:00.000",
  "actrUpdatDtm": "2023-10-04T10:20:00.000",
  "actrRetryDtm": "2023-10-04T10:30:00.000",
  "actrRetRefNo": "RET1234567890",
  "actrRetRefNoExpire": "2023-10-04T23:59:59.000",
  "actrComments": "Transaction completed successfully.",
  "actrFromAcctName": "John Doe",
  "actrFromDisplayName": "John",
  "actrFromBranchCode": "BR123",
  "actrFromCurrCd": "USD",
  "actrFromProvCd": "NY",
  "actrFromCountryCd": "US",
  "actrFromCifNo": "CIF12345678",
  "actrToAcctType": "CHK",
  "actrTerminalId": "TERM12345",
  "actrPanId": 1234567890123456789,
  "actrReciptNo": 123456,
  "actrTransTime": 153030,
  "actrTransType": 101,
  "actrLocationCd": 10,
  "actrFromBranchOwner": 100001,
  "actrMsgType": 1100,
  "actrFromTaxId": "TAX1234567",
  "actrEffDate": "2023-10-04",
  "actrSettlementDate": "2023",
  "actrReceiverTaxId": "TAX7654321",
  "actrReceiverBankBranchCd": "BR987",
  "actrReceiverType": "P",
  "actrInputTerminal": "TERMINAL9876",
  "actrOverrideFeeAmt": 0.00,
  "actrRetryCnt": 1,
  "actrLookupServerName": "lookup-server-01",
  "actrTfrServerName": "tfr-server-01",
  "actrMqServerName": "mq-server-01",
  "actrSenderType": "S",
  "actrFromRealAcctId": "REAL1234567890",
  "actrFromRealBranchId": "REALBR123",
  "actrFromRealCifId": "REALCIF123456",
  "actrFromAccountClass": "A",
  "actrToAccountClass": "B",
  "actrDebitFeeAccount1": "DEBITACC001",
  "actrDebitFeeAccount1class": "A",
  "actrDebitFeeAccount2": "DEBITACC002",
  "actrDebitFeeAccount2class": "B",
  "actrCreditAcqFeeAccount": "CREDITACQ001",
  "actrCreditAcqFeeAccountclass": "A",
  "actrCreditIssuerFeeAccount": "CREDITISSUER001",
  "actrCreditIssuerFeeAccountclass": "A",
  "actrCreditToacFeeAccount": "CREDITTOAC001",
  "actrCreditToacFeeAccountclass": "B",
  "actrCreditFeeAccount2": "CREDITFEE002",
  "actrCreditFeeAccount2class": "B",
  "actrDebitFeeAmount1": 5.00,
  "actrCreditAcqFeeAmount": 10.00,
  "actrCreditIssuerFeeAmount": 15.00,
  "actrCreditToacFeeAmount": 7.50,
  "actrFee2Amount": 3.00,
  "actrTransCostcenter": "CC001",
  "actrDebitFeeCostcenter1": "DCC001",
  "actrDebitFeeCostcenter2": "DCC002",
  "actrCreditAcqFeeCostcenter": "CCC001",
  "actrCreditIssuerFeeCostcenter": "CCC002",
  "actrCreditToaccFeeCostcenter": "CCC003",
  "actrCreditFeeCostcenter2": "CCC004",
  "actrTransComment": "Fee transaction",
  "actrDebitFeeComment": "Debit fee",
  "actrCreditAcqFeeComment": "Acquirer fee",
  "actrCreditIssuerFeeComment": "Issuer fee",
  "actrCreditToaccFeeComment": "Beneficiary fee",
  "actrFee2Comment": "Additional fee"
}
 */
