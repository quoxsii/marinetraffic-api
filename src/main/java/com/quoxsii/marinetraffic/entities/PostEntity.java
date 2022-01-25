package com.quoxsii.marinetraffic.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Класс сущность пост.
 */
@Entity
@Table(name = "post")
public class PostEntity {
    /**
     * Поле идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Поле название.
     */
    private String name;
    /**
     * Поле ссылка.
     */
    private String url;

    /**
     * Поле список сущностей суден {@link VesselEntity}.
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<VesselEntity> vesselEntities;

    /**
     * Конструктор - создание нового объекта.
     */
    public PostEntity() {
    }

    /**
     * Функция получения значения поля {@link PostEntity#vesselEntities}.
     * @return возвращает список сущностей суден.
     */
    public List<VesselEntity> getVesselEntities() {
        return vesselEntities;
    }

    /**
     * Процедура определения сущностей судов {@link PostEntity#vesselEntities}.
     * @param vesselEntities список сущностей судов.
     */
    public void setVesselEntities(List<VesselEntity> vesselEntities) {
        this.vesselEntities = vesselEntities;
    }

    /**
     * Функция получения значения поля {@link PostEntity#id}.
     * @return возвращает идентификатор сущности поста.
     */
    public Long getId() {
        return id;
    }

    /**
     * Процедура определения идентификатора поста {@link PostEntity#id}.
     * @param id идентификатор сущности поста.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля {@link PostEntity#name}.
     * @return возвращает название поста.
     */
    public String getName() {
        return name;
    }

    /**
     * Процедура определения названия поста {@link PostEntity#name}.
     * @param name название поста.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция получения значения поля {@link PostEntity#url}.
     * @return возвращает ссылку поста.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Процедура определения ссылки поста {@link PostEntity#url}.
     * @param url ссылка поста.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}