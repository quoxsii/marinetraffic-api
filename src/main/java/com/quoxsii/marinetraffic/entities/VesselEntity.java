package com.quoxsii.marinetraffic.entities;

import javax.persistence.*;

/**
 * Класс сущность судно.
 */
@Entity
@Table(name = "vessel", uniqueConstraints = @UniqueConstraint(columnNames = "mmsi"))
public class VesselEntity {
    /**
     * Поле идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Поле морской идентификатор мобильной службы.
     */
    private String mmsi;
    /**
     * Поле страна.
     */
    private String country;
    /**
     * Поле длина.
     */
    private Integer length;
    /**
     * Поле ширина.
     */
    private Integer width;
    /**
     * Поле осадка.
     */
    private Float draught;
    /**
     * Поле позывной.
     */
    private String callSign;
    /**
     * Поле код типа.
     */
    private Integer typeCode;
    /**
     * Поле тип.
     */
    private String type;
    /**
     * Поле подробности типа.
     */
    private String typeDetail;
    /**
     * Поле название.
     */
    private String name;

    /**
     * Поле сущность пост {@link PostEntity}.
     */
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity postEntity;

    /**
     * Конструктор - создание нового объекта.
     */
    public VesselEntity() {
    }

    /**
     * Метод получения значения поля {@link VesselEntity#postEntity}.
     * @return возвращает сущность пост.
     */
    public PostEntity getPostEntity() {
        return postEntity;
    }

    /**
     * Метод определения сущности поста {@link VesselEntity#postEntity}.
     * @param postEntity сущность пост.
     */
    public void setPostEntity(PostEntity postEntity) {
        this.postEntity = postEntity;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#id}.
     * @return возвращает идентификатор сущности судна.
     */
    public Long getId() {
        return id;
    }

    /**
     * Метод определения идентификатора сущности судна {@link VesselEntity#id}.
     * @param id идентификатор сущности судна.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#mmsi}.
     * @return возвращает морской идентификатор мобильной службы судна.
     */
    public String getMmsi() {
        return mmsi;
    }

    /**
     * Метод определения морского идентификатора мобильной службы судна {@link VesselEntity#mmsi}.
     * @param mmsi морской идентификатор мобильной службы судна.
     */
    public void setMmsi(String mmsi) {
        this.mmsi = mmsi;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#country}.
     * @return возвращает страну судна.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Метод определения страны судна {@link VesselEntity#country}.
     * @param country страна судна.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#length}.
     * @return возвращает длину судна.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Метод определения длины судна {@link VesselEntity#length}.
     * @param length длина судна.
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#width}.
     * @return возвращает ширину судна.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Метод определения ширины судна {@link VesselEntity#width}.
     * @param width ширина судна.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#draught}.
     * @return возвращает осадку судна.
     */
    public Float getDraught() {
        return draught;
    }

    /**
     * Метод определения осадки судна {@link VesselEntity#draught}.
     * @param draught осадка судна.
     */
    public void setDraught(Float draught) {
        this.draught = draught;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#callSign}.
     * @return возвращает позывной судна.
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Метод определения позывного судна {@link VesselEntity#callSign}.
     * @param callSign позывной судна.
     */
    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#typeCode}.
     * @return возвращает код типа судна.
     */
    public Integer getTypeCode() {
        return typeCode;
    }

    /**
     * Метод определения кода типа судна {@link VesselEntity#typeCode}.
     * @param typeCode код типа судна.
     */
    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#type}.
     * @return возвращает тип судна.
     */
    public String getType() {
        return type;
    }

    /**
     * Метод определения типа судна {@link VesselEntity#type}.
     * @param type тип судна.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#typeDetail}.
     * @return возвращает подробности по типу судна.
     */
    public String getTypeDetail() {
        return typeDetail;
    }

    /**
     * Метод определения подробностей типа судна {@link VesselEntity#typeDetail}.
     * @param typeDetail подробности типа судна.
     */
    public void setTypeDetail(String typeDetail) {
        this.typeDetail = typeDetail;
    }

    /**
     * Метод получения значения поля {@link VesselEntity#name}.
     * @return возвращает название судна.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод определения названия судна {@link VesselEntity#name}.
     * @param name название судна.
     */
    public void setName(String name) {
        this.name = name;
    }
}
