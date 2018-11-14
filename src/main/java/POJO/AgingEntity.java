package POJO;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "aging")
public class AgingEntity {
    private long id;
    private String agingType;
    private String deliveryCustomerName;
    private long deliveryCustomerId;
    private String targetStorehouse;
    private Timestamp arrivalTime;
    private String brand;
    private String transportMode;
    private String poNumber;
    private String operateStatus;
    private Long operatorId;
    private String operatorName;
    private Timestamp operateTime;
    private Long operatorDeptId;
    private String operatorDeptName;
    private long recorderId;
    private String recorderName;
    private Long recorderDeptId;
    private String recorderDeptName;
    private Timestamp recordTime;
    private String remark;
    private String traceId;
    private byte enabledFlag;
    private String createdBy;
    private Timestamp creationDate;
    private String updatedBy;
    private Timestamp updationDate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "aging_type")
    public String getAgingType() {
        return agingType;
    }

    public void setAgingType(String agingType) {
        this.agingType = agingType;
    }

    @Basic
    @Column(name = "delivery_customer_name")
    public String getDeliveryCustomerName() {
        return deliveryCustomerName;
    }

    public void setDeliveryCustomerName(String deliveryCustomerName) {
        this.deliveryCustomerName = deliveryCustomerName;
    }

    @Basic
    @Column(name = "delivery_customer_id")
    public long getDeliveryCustomerId() {
        return deliveryCustomerId;
    }

    public void setDeliveryCustomerId(long deliveryCustomerId) {
        this.deliveryCustomerId = deliveryCustomerId;
    }

    @Basic
    @Column(name = "target_storehouse")
    public String getTargetStorehouse() {
        return targetStorehouse;
    }

    public void setTargetStorehouse(String targetStorehouse) {
        this.targetStorehouse = targetStorehouse;
    }

    @Basic
    @Column(name = "arrival_time")
    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "transport_mode")
    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    @Basic
    @Column(name = "po_number")
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    @Basic
    @Column(name = "operate_status")
    public String getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus;
    }

    @Basic
    @Column(name = "operator_id")
    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "operator_name")
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Basic
    @Column(name = "operate_time")
    public Timestamp getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }

    @Basic
    @Column(name = "operator_dept_id")
    public Long getOperatorDeptId() {
        return operatorDeptId;
    }

    public void setOperatorDeptId(Long operatorDeptId) {
        this.operatorDeptId = operatorDeptId;
    }

    @Basic
    @Column(name = "operator_dept_name")
    public String getOperatorDeptName() {
        return operatorDeptName;
    }

    public void setOperatorDeptName(String operatorDeptName) {
        this.operatorDeptName = operatorDeptName;
    }

    @Basic
    @Column(name = "recorder_id")
    public long getRecorderId() {
        return recorderId;
    }

    public void setRecorderId(long recorderId) {
        this.recorderId = recorderId;
    }

    @Basic
    @Column(name = "recorder_name")
    public String getRecorderName() {
        return recorderName;
    }

    public void setRecorderName(String recorderName) {
        this.recorderName = recorderName;
    }

    @Basic
    @Column(name = "recorder_dept_id")
    public Long getRecorderDeptId() {
        return recorderDeptId;
    }

    public void setRecorderDeptId(Long recorderDeptId) {
        this.recorderDeptId = recorderDeptId;
    }

    @Basic
    @Column(name = "recorder_dept_name")
    public String getRecorderDeptName() {
        return recorderDeptName;
    }

    public void setRecorderDeptName(String recorderDeptName) {
        this.recorderDeptName = recorderDeptName;
    }

    @Basic
    @Column(name = "record_time")
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "trace_id")
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Basic
    @Column(name = "enabled_flag")
    public byte getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(byte enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "creation_date")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "updation_date")
    public Timestamp getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Timestamp updationDate) {
        this.updationDate = updationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgingEntity that = (AgingEntity) o;

        if (id != that.id) return false;
        if (deliveryCustomerId != that.deliveryCustomerId) return false;
        if (recorderId != that.recorderId) return false;
        if (enabledFlag != that.enabledFlag) return false;
        if (agingType != null ? !agingType.equals(that.agingType) : that.agingType != null) return false;
        if (deliveryCustomerName != null ? !deliveryCustomerName.equals(that.deliveryCustomerName) : that.deliveryCustomerName != null)
            return false;
        if (targetStorehouse != null ? !targetStorehouse.equals(that.targetStorehouse) : that.targetStorehouse != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(that.arrivalTime) : that.arrivalTime != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (transportMode != null ? !transportMode.equals(that.transportMode) : that.transportMode != null)
            return false;
        if (poNumber != null ? !poNumber.equals(that.poNumber) : that.poNumber != null) return false;
        if (operateStatus != null ? !operateStatus.equals(that.operateStatus) : that.operateStatus != null)
            return false;
        if (operatorId != null ? !operatorId.equals(that.operatorId) : that.operatorId != null) return false;
        if (operatorName != null ? !operatorName.equals(that.operatorName) : that.operatorName != null) return false;
        if (operateTime != null ? !operateTime.equals(that.operateTime) : that.operateTime != null) return false;
        if (operatorDeptId != null ? !operatorDeptId.equals(that.operatorDeptId) : that.operatorDeptId != null)
            return false;
        if (operatorDeptName != null ? !operatorDeptName.equals(that.operatorDeptName) : that.operatorDeptName != null)
            return false;
        if (recorderName != null ? !recorderName.equals(that.recorderName) : that.recorderName != null) return false;
        if (recorderDeptId != null ? !recorderDeptId.equals(that.recorderDeptId) : that.recorderDeptId != null)
            return false;
        if (recorderDeptName != null ? !recorderDeptName.equals(that.recorderDeptName) : that.recorderDeptName != null)
            return false;
        if (recordTime != null ? !recordTime.equals(that.recordTime) : that.recordTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (traceId != null ? !traceId.equals(that.traceId) : that.traceId != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
        if (updationDate != null ? !updationDate.equals(that.updationDate) : that.updationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (agingType != null ? agingType.hashCode() : 0);
        result = 31 * result + (deliveryCustomerName != null ? deliveryCustomerName.hashCode() : 0);
        result = 31 * result + (int) (deliveryCustomerId ^ (deliveryCustomerId >>> 32));
        result = 31 * result + (targetStorehouse != null ? targetStorehouse.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (transportMode != null ? transportMode.hashCode() : 0);
        result = 31 * result + (poNumber != null ? poNumber.hashCode() : 0);
        result = 31 * result + (operateStatus != null ? operateStatus.hashCode() : 0);
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (operatorName != null ? operatorName.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (operatorDeptId != null ? operatorDeptId.hashCode() : 0);
        result = 31 * result + (operatorDeptName != null ? operatorDeptName.hashCode() : 0);
        result = 31 * result + (int) (recorderId ^ (recorderId >>> 32));
        result = 31 * result + (recorderName != null ? recorderName.hashCode() : 0);
        result = 31 * result + (recorderDeptId != null ? recorderDeptId.hashCode() : 0);
        result = 31 * result + (recorderDeptName != null ? recorderDeptName.hashCode() : 0);
        result = 31 * result + (recordTime != null ? recordTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (traceId != null ? traceId.hashCode() : 0);
        result = 31 * result + (int) enabledFlag;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updationDate != null ? updationDate.hashCode() : 0);
        return result;
    }
}
