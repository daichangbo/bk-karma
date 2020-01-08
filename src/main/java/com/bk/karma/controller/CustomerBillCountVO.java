package com.bk.karma.controller;

import com.google.common.base.MoreObjects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: kongxiangke
 * Date: 16/6/27
 * Time: 15:43
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerBillCountVO implements Serializable {

    /**
     * 客户id
     */
    private int customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 应收账款
     */
    private BigDecimal shouldReceive = BigDecimal.ZERO;

    /**
     * 应付账款
     */
    private BigDecimal shouldPay = BigDecimal.ZERO;

    /**
     * 预付款
     **/
    private BigDecimal prePaymentBalance = BigDecimal.ZERO;

    /**
     * 预收款
     **/
    private BigDecimal preReceivedBalance = BigDecimal.ZERO;

    /**
     * 余额
     */
    private BigDecimal balanceMoney;

    /**
     * 限额
     */
    private BigDecimal quota;

    /**
     * 附加限额
     */
    private BigDecimal additionQuota;

    /**
     * 警戒限额
     */
    private BigDecimal warningQuota;

    /**
     * 赊账期
     */
    private int creditDay;

    /**
     * 可挂账余额
     */
    private BigDecimal canCreditQuota;

    /**
     * 业务主管
     */
    private String businessDirector;

    /**
     * 财务主管
     */
    private String financeDirector;

    /**
     * 已赊账天数
     */
    private int hasCreditedDays;

    /**
     * 余额大于限额选项
     */
    private boolean balanceGTQuota;

    /**
     * 余额大于警戒选项
     */
    private boolean balanceGTWarnQuota;

    /**
     * 超账期选项
     */
    private boolean overCreditDay;

    /**
     * 送货信息
     */
    private String deliveryInfo;

    /**
     * 结算方式
     */
    private Integer payType;
    /**
     * 结算方式描述
     */
    private String payTypeDesc;

    /**
     * 财务备注
     */
    private String financeRemark;
    /**
     * 结算日 yyyy-MM-dd
     */
    private String accountDay;

    private Date creditTime;
    /**
     * 1：可以开单，0：不可以
     */
    private int isNotOpen = 0;
    /**
     * 超期可挂,0:不可挂；1:可挂
     */
    private int allowOverDay;

    /**
     * 超额可挂,0:不可挂；1:可挂
     */
    private int allowOverQuota;

    /**
     * 月结日
     */
    private Integer monthlyStatementDay;

    /**
     * 赊账方式，0:赊账期；1:月结日
     */
    private int creditWay;




    public BigDecimal getBalanceMoney(){
        if (balanceMoney != null){
            return balanceMoney;
        }
        return MoreObjects.firstNonNull(shouldReceive,BigDecimal.ZERO)
                .subtract( MoreObjects.firstNonNull(preReceivedBalance, BigDecimal.ZERO))
                .subtract( MoreObjects.firstNonNull(shouldPay, BigDecimal.ZERO))
                .add( MoreObjects.firstNonNull(prePaymentBalance, BigDecimal.ZERO));
    }

    public BigDecimal getCanCreditQuota() {
        if(MoreObjects.firstNonNull(getQuota(), BigDecimal.ZERO).doubleValue() <0.01) {
            return BigDecimal.ZERO;
        }
        return MoreObjects.firstNonNull(getQuota(), BigDecimal.ZERO)
                .add( MoreObjects.firstNonNull(getAdditionQuota(), BigDecimal.ZERO))
                .subtract( MoreObjects.firstNonNull(getBalanceMoney(), BigDecimal.ZERO));
    }
}
