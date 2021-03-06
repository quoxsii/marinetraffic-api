package com.quoxsii.marinetraffic.entities;

import javax.persistence.*;

/**
 * Класс сущность муршрут судна.
 */
@Entity
@Table(name = "vessel_route")
public class VesselRouteEntity {
    /**
     * Поле идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Поле широта.
     */
    private Float lat;
    /**
     * Поле долгота.
     */
    private Float lon;
    /**
     * Поле курс относительно грунта.
     */
    private Float cog;
    /**
     * Поле скорость относительно грунта.
     */
    private Float sog;
    /**
     * Поле курс.
     */
    private Integer trueHeading;
    /**
     * Поле ожидаемое время прибытия.
     */
    private String eta;
    /**
     * Поле индикатор скорости поворота.
     */
    private Float rot;
    /**
     * Поле код состояния навигации.
     */
    private Integer navStateCode;
    /**
     * Поле состояние навигации.
     */
    private String navState;
    /**
     * Поле пункт назначения.
     */
    private String destination;
    /**
     * Поле время сообщения.
     */
    private String msgTime;

    /**
     * Поле сущность судна.
     */
    @ManyToOne
    @JoinColumn(name = "vessel_id", nullable = false)
    private VesselEntity vesselEntity;

    /**
     * Конструктор - создание нового объекта.
     */
    public VesselRouteEntity() {
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#vesselEntity}.
     * @return возвращает сущность судно.
     */
    public VesselEntity getVesselEntity() {
        return vesselEntity;
    }

    /**
     * Метод определения сущности судна {@link VesselRouteEntity#vesselEntity}.
     * @param vesselEntity сущность судно.
     */
    public void setVesselEntity(VesselEntity vesselEntity) {
        this.vesselEntity = vesselEntity;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#id}.
     * @return возвращает идентификатор сущности муршруты судна.
     */
    public Long getId() {
        return id;
    }

    /**
     * Метод определения идентификатора сущности муршруты судна {@link VesselRouteEntity#id}.
     * @param id идентификатор сущности муршруты судна.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#lat}.
     * @return возвращает широту судна.
     */
    public Float getLat() {
        return lat;
    }

    /**
     * Метод определения широты судна {@link VesselRouteEntity#lat}.
     * @param lat широта судна.
     */
    public void setLat(Float lat) {
        this.lat = lat;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#lon}.
     * @return возвращает долготу судна.
     */
    public Float getLon() {
        return lon;
    }

    /**
     * Метод определения долготы судна {@link VesselRouteEntity#lon}.
     * @param lon долгота судна.
     */
    public void setLon(Float lon) {
        this.lon = lon;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#cog}.
     * @return возвращает курс судна относительно грунта.
     */
    public Float getCog() {
        return cog;
    }

    /**
     * Метод определения курса судна относительно грунта {@link VesselRouteEntity#cog}.
     * @param cog курс судна относительно грунта.
     */
    public void setCog(Float cog) {
        this.cog = cog;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#sog}.
     * @return возвращает скорость судна относительно грунта.
     */
    public Float getSog() {
        return sog;
    }

    /**
     * Метод определения скорости судна относительно грунта {@link VesselRouteEntity#sog}.
     * @param sog скорость судна относительно грунта.
     */
    public void setSog(Float sog) {
        this.sog = sog;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#trueHeading}.
     * @return возвращает курс судна.
     */
    public Integer getTrueHeading() {
        return trueHeading;
    }

    /**
     * Метод определения курса судна {@link VesselRouteEntity#trueHeading}.
     * @param trueHeading курс судна.
     */
    public void setTrueHeading(Integer trueHeading) {
        this.trueHeading = trueHeading;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#eta}.
     * @return возвращает ожидаемое время прибытия судна.
     */
    public String getEta() {
        return eta;
    }

    /**
     * Метод определения времени прибытия судна {@link VesselRouteEntity#eta}.
     * @param eta ожидаемое время прибытия судна.
     */
    public void setEta(String eta) {
        this.eta = eta;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#rot}.
     * @return возвращает индикатор скорости поворота судна.
     */
    public Float getRot() {
        return rot;
    }

    /**
     * Метод определения скорости поворота судна {@link VesselRouteEntity#rot}.
     * @param rot индикатор скорости поворота судна.
     */
    public void setRot(Float rot) {
        this.rot = rot;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#navStateCode}.
     * @return возвращает код состояния навигации судна.
     */
    public Integer getNavStateCode() {
        return navStateCode;
    }

    /**
     * Метод определения кода состояния навигации судна {@link VesselRouteEntity#navStateCode}.
     * @param navStateCode код состояния навигации судна.
     */
    public void setNavStateCode(Integer navStateCode) {
        this.navStateCode = navStateCode;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#navState}.
     * @return возвращает состояние навигации судна.
     */
    public String getNavState() {
        return navState;
    }

    /**
     * Метод определения состояния навигации судна {@link VesselRouteEntity#navState}.
     * @param navState состояние навигации судна.
     */
    public void setNavState(String navState) {
        this.navState = navState;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#destination}.
     * @return возвращает пункт назначения судна.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Метод определения пункта назначения судна {@link VesselRouteEntity#destination}.
     * @param destination пункт назначения судна.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Метод получения значения поля {@link VesselRouteEntity#msgTime}.
     * @return возвращает время сообщения от судна.
     */
    public String getMsgTime() {
        return msgTime;
    }

    /**
     * Метод определения времени сообщения от судна {@link VesselRouteEntity#msgTime}.
     * @param msgTime время сообщения от судна.
     */
    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }
}
