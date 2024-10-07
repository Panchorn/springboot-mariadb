-- auto-generated definition
create table actual_credit_transfer
(
    actr_seq_id                         bigint auto_increment
        primary key,
    actr_txn_ref_id                     varchar(20)                                not null,
    actr_req_channel                    varchar(30)                                not null,
    actr_req_by                         varchar(20)                                not null,
    actr_req_dtm                        timestamp(3) default current_timestamp(3)  null,
    actr_req_id                         varchar(30)                                not null,
    actr_from_acct_id                   varchar(20)                                not null,
    actr_from_acct_type                 varchar(10)                                null,
    actr_from_acct_status               decimal(2)                                 null,
    actr_to_acct_id                     varchar(100)                               null,
    actr_to_bank_cd                     varchar(10)                                null,
    actr_to_acct_name                   varchar(160)                               null,
    actr_to_display_name                varchar(50)                                null,
    actr_amt                            decimal(17, 2)                             not null,
    actr_issuer_fee_amt                 decimal(10, 2)                             null,
    actr_acquirer_fee_amt               decimal(10, 2)                             null,
    actr_beneficiary_fee_amt            decimal(10, 2)                             null,
    actr_total_fee_amt                  decimal(10, 2)                             null,
    actr_tfr_dtm                        timestamp(3) default current_timestamp(3)  null,
    actr_status                         varchar(10)                                not null,
    actr_status_cd                      varchar(10)                                null,
    actr_status_desc                    varchar(200)                               null,
    actr_tfr_ref_no                     varchar(20)                                null,
    actr_creat_dtm                      timestamp(3) default current_timestamp(3)  null,
    actr_updat_dtm                      timestamp(3) default current_timestamp(3)  null,
    actr_retry_dtm                      timestamp(3) default current_timestamp(3)  null,
    actr_ret_ref_no                     varchar(20)                                not null,
    actr_ret_ref_no_expire              timestamp    default '0000-00-00 00:00:00' null,
    actr_comments                       varchar(100)                               null,
    actr_from_acct_name                 varchar(64)                                not null,
    actr_from_display_name              varchar(50)                                not null,
    actr_from_branch_code               varchar(10)                                not null,
    actr_from_curr_cd                   varchar(10)                                not null,
    actr_from_prov_cd                   varchar(10)                                not null,
    actr_from_country_cd                varchar(10)                                not null,
    actr_from_cif_no                    varchar(12)                                not null,
    actr_to_acct_type                   varchar(10)                                null,
    actr_terminal_id                    varchar(16)                                null,
    actr_pan_id                         decimal(19)                                null,
    actr_recipt_no                      decimal(6)                                 null,
    actr_trans_time                     decimal(6)                                 null,
    actr_trans_type                     decimal(6)                                 null,
    actr_location_cd                    decimal(2)                                 null,
    actr_from_branch_owner              decimal(6)                                 null,
    actr_msg_type                       decimal(4)                                 null,
    actr_from_tax_id                    varchar(20)                                null,
    actr_eff_date                       date                                       null,
    actr_settlement_date                varchar(4)                                 null,
    actr_receiver_tax_id                varchar(13)                                null,
    actr_receiver_bank_branch_cd        varchar(6)                                 null,
    actr_receiver_type                  char                                       null,
    actr_input_terminal                 varchar(100)                               null,
    actr_override_fee_amt               decimal(10, 2)                             null,
    actr_retry_cnt                      int                                        null,
    actr_lookup_server_name             varchar(200)                               null,
    actr_tfr_server_name                varchar(200)                               null,
    actr_mq_server_name                 varchar(200)                               null,
    actr_sender_type                    char                                       null,
    actr_from_real_acct_id              varchar(20)                                null,
    actr_from_real_branch_id            varchar(10)                                null,
    actr_from_real_cif_id               varchar(12)                                null,
    actr_from_account_class             char                                       null,
    actr_to_account_class               char                                       null,
    actr_debit_fee_account1             varchar(12)                                null,
    actr_debit_fee_account1class        char                                       null,
    actr_debit_fee_account2             varchar(12)                                null,
    actr_debit_fee_account2class        char                                       null,
    actr_credit_acq_fee_account         varchar(12)                                null,
    actr_credit_acq_fee_accountclass    char                                       null,
    actr_credit_issuer_fee_account      varchar(12)                                null,
    actr_credit_issuer_fee_accountclass char                                       null,
    actr_credit_toac_fee_account        varchar(12)                                null,
    actr_credit_toac_fee_accountclass   char                                       null,
    actr_credit_fee_account2            varchar(12)                                null,
    actr_credit_fee_account2class       char                                       null,
    actr_debit_fee_amount1              decimal(17, 2)                             null,
    actr_credit_acq_fee_amount          decimal(17, 2)                             null,
    actr_credit_issuer_fee_amount       decimal(17, 2)                             null,
    actr_credit_toac_fee_amount         decimal(17, 2)                             null,
    actr_fee2_amount                    decimal(17, 2)                             null,
    actr_trans_costcenter               varchar(6)                                 null,
    actr_debit_fee_costcenter1          varchar(6)                                 null,
    actr_debit_fee_costcenter2          varchar(6)                                 null,
    actr_credit_acq_fee_costcenter      varchar(6)                                 null,
    actr_credit_issuer_fee_costcenter   varchar(6)                                 null,
    actr_credit_toacc_fee_costcenter    varchar(6)                                 null,
    actr_credit_fee_costcenter2         varchar(6)                                 null,
    actr_trans_comment                  varchar(100)                               null,
    actr_debit_fee_comment              varchar(100)                               null,
    actr_credit_acq_fee_comment         varchar(100)                               null,
    actr_credit_issuer_fee_comment      varchar(100)                               null,
    actr_credit_toacc_fee_comment       varchar(100)                               null,
    actr_fee2_comment                   varchar(100)                               null
);

create index idx_actual_credit_transfer_01
    on actual_credit_transfer (actr_req_dtm, actr_from_acct_id, actr_to_acct_id);

create index idx_actual_credit_transfer_02
    on actual_credit_transfer (actr_txn_ref_id, actr_req_dtm);

