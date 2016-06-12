//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.12 at 06:40:11 PM IDT 
//


package com.monopoly.scheme;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assets">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countries">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="country" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="city" type="{}cityType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="utilities">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="utility" type="{}simpleAssetType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="stayCost" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="transportations">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="transportation" type="{}simpleAssetType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="stayCost" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="surprise">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{}surpriseCards" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="warrant">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{}warrantCards" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="board" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startSquare" type="{}startSquareType"/>
 *                   &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
 *                   &lt;element name="jailSlashFreeSpaceSquare" type="{}jailSlashFreeSpaceSquareType"/>
 *                   &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
 *                   &lt;element name="parkingSquare" type="{}parkingSquareType"/>
 *                   &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
 *                   &lt;element name="gotoJailSquare" type="{}gotoJailSquareType"/>
 *                   &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assets",
    "surprise",
    "warrant",
    "board"
})
@XmlRootElement(name = "monopoly")
public class Monopoly {

    @XmlElement(required = true)
    protected Monopoly.Assets assets;
    @XmlElement(required = true)
    protected Monopoly.Surprise surprise;
    @XmlElement(required = true)
    protected Monopoly.Warrant warrant;
    protected Monopoly.Board board;

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link Monopoly.Assets }
     *     
     */
    public Monopoly.Assets getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monopoly.Assets }
     *     
     */
    public void setAssets(Monopoly.Assets value) {
        this.assets = value;
    }

    /**
     * Gets the value of the surprise property.
     * 
     * @return
     *     possible object is
     *     {@link Monopoly.Surprise }
     *     
     */
    public Monopoly.Surprise getSurprise() {
        return surprise;
    }

    /**
     * Sets the value of the surprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monopoly.Surprise }
     *     
     */
    public void setSurprise(Monopoly.Surprise value) {
        this.surprise = value;
    }

    /**
     * Gets the value of the warrant property.
     * 
     * @return
     *     possible object is
     *     {@link Monopoly.Warrant }
     *     
     */
    public Monopoly.Warrant getWarrant() {
        return warrant;
    }

    /**
     * Sets the value of the warrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monopoly.Warrant }
     *     
     */
    public void setWarrant(Monopoly.Warrant value) {
        this.warrant = value;
    }

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link Monopoly.Board }
     *     
     */
    public Monopoly.Board getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monopoly.Board }
     *     
     */
    public void setBoard(Monopoly.Board value) {
        this.board = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="countries">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="country" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="city" type="{}cityType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="utilities">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="utility" type="{}simpleAssetType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="stayCost" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="transportations">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="transportation" type="{}simpleAssetType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="stayCost" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countries",
        "utilities",
        "transportations"
    })
    public static class Assets {

        @XmlElement(required = true)
        protected Monopoly.Assets.Countries countries;
        @XmlElement(required = true)
        protected Monopoly.Assets.Utilities utilities;
        @XmlElement(required = true)
        protected Monopoly.Assets.Transportations transportations;

        /**
         * Gets the value of the countries property.
         * 
         * @return
         *     possible object is
         *     {@link Monopoly.Assets.Countries }
         *     
         */
        public Monopoly.Assets.Countries getCountries() {
            return countries;
        }

        /**
         * Sets the value of the countries property.
         * 
         * @param value
         *     allowed object is
         *     {@link Monopoly.Assets.Countries }
         *     
         */
        public void setCountries(Monopoly.Assets.Countries value) {
            this.countries = value;
        }

        /**
         * Gets the value of the utilities property.
         * 
         * @return
         *     possible object is
         *     {@link Monopoly.Assets.Utilities }
         *     
         */
        public Monopoly.Assets.Utilities getUtilities() {
            return utilities;
        }

        /**
         * Sets the value of the utilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link Monopoly.Assets.Utilities }
         *     
         */
        public void setUtilities(Monopoly.Assets.Utilities value) {
            this.utilities = value;
        }

        /**
         * Gets the value of the transportations property.
         * 
         * @return
         *     possible object is
         *     {@link Monopoly.Assets.Transportations }
         *     
         */
        public Monopoly.Assets.Transportations getTransportations() {
            return transportations;
        }

        /**
         * Sets the value of the transportations property.
         * 
         * @param value
         *     allowed object is
         *     {@link Monopoly.Assets.Transportations }
         *     
         */
        public void setTransportations(Monopoly.Assets.Transportations value) {
            this.transportations = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="country" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="city" type="{}cityType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "country"
        })
        public static class Countries {

            @XmlElement(required = true)
            protected List<Monopoly.Assets.Countries.Country> country;

            /**
             * Gets the value of the country property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the country property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCountry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Monopoly.Assets.Countries.Country }
             * 
             * 
             */
            public List<Monopoly.Assets.Countries.Country> getCountry() {
                if (country == null) {
                    country = new ArrayList<Monopoly.Assets.Countries.Country>();
                }
                return this.country;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="city" type="{}cityType" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "city"
            })
            public static class Country {

                @XmlElement(required = true)
                protected List<CityType> city;
                @XmlAttribute(name = "name", required = true)
                protected String name;

                /**
                 * Gets the value of the city property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the city property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CityType }
                 * 
                 * 
                 */
                public List<CityType> getCity() {
                    if (city == null) {
                        city = new ArrayList<CityType>();
                    }
                    return this.city;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="transportation" type="{}simpleAssetType" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="stayCost" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "transportation"
        })
        public static class Transportations {

            @XmlElement(required = true)
            protected List<SimpleAssetType> transportation;
            @XmlAttribute(name = "stayCost", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long stayCost;

            /**
             * Gets the value of the transportation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transportation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransportation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleAssetType }
             * 
             * 
             */
            public List<SimpleAssetType> getTransportation() {
                if (transportation == null) {
                    transportation = new ArrayList<SimpleAssetType>();
                }
                return this.transportation;
            }

            /**
             * Gets the value of the stayCost property.
             * 
             */
            public long getStayCost() {
                return stayCost;
            }

            /**
             * Sets the value of the stayCost property.
             * 
             */
            public void setStayCost(long value) {
                this.stayCost = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="utility" type="{}simpleAssetType" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="stayCost" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "utility"
        })
        public static class Utilities {

            @XmlElement(required = true)
            protected List<SimpleAssetType> utility;
            @XmlAttribute(name = "stayCost", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long stayCost;

            /**
             * Gets the value of the utility property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the utility property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUtility().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleAssetType }
             * 
             * 
             */
            public List<SimpleAssetType> getUtility() {
                if (utility == null) {
                    utility = new ArrayList<SimpleAssetType>();
                }
                return this.utility;
            }

            /**
             * Gets the value of the stayCost property.
             * 
             */
            public long getStayCost() {
                return stayCost;
            }

            /**
             * Sets the value of the stayCost property.
             * 
             */
            public void setStayCost(long value) {
                this.stayCost = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="startSquare" type="{}startSquareType"/>
     *         &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
     *         &lt;element name="jailSlashFreeSpaceSquare" type="{}jailSlashFreeSpaceSquareType"/>
     *         &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
     *         &lt;element name="parkingSquare" type="{}parkingSquareType"/>
     *         &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
     *         &lt;element name="gotoJailSquare" type="{}gotoJailSquareType"/>
     *         &lt;element name="square" type="{}squareType" maxOccurs="8" minOccurs="8"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Board {

        @XmlElementRefs({
            @XmlElementRef(name = "parkingSquare", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "startSquare", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "jailSlashFreeSpaceSquare", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "gotoJailSquare", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "square", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends SquareBase>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "Square" is used by two different parts of a schema. See: 
         * line 243 of file:/Users/ShiloMangam/Documents/workspace/MonopolyClient/src/conf/xml-resources/jaxb/MonopolyScheme/monopoly_config.xsd
         * line 241 of file:/Users/ShiloMangam/Documents/workspace/MonopolyClient/src/conf/xml-resources/jaxb/MonopolyScheme/monopoly_config.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link JailSlashFreeSpaceSquareType }{@code >}
         * {@link JAXBElement }{@code <}{@link GotoJailSquareType }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingSquareType }{@code >}
         * {@link JAXBElement }{@code <}{@link SquareType }{@code >}
         * {@link JAXBElement }{@code <}{@link StartSquareType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends SquareBase>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<? extends SquareBase>>();
            }
            return this.content;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{}surpriseCards" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "surpriseCards"
    })
    public static class Surprise {

        @XmlElements({
            @XmlElement(name = "monetary", type = MonetaryCard.class),
            @XmlElement(name = "goto", type = GotoCard.class),
            @XmlElement(name = "getOutOfJail", type = GetOutOfJailCard.class)
        })
        protected List<CardBase> surpriseCards;

        /**
         * Gets the value of the surpriseCards property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surpriseCards property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurpriseCards().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryCard }
         * {@link GotoCard }
         * {@link GetOutOfJailCard }
         * 
         * 
         */
        public List<CardBase> getSurpriseCards() {
            if (surpriseCards == null) {
                surpriseCards = new ArrayList<CardBase>();
            }
            return this.surpriseCards;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{}warrantCards" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "warrantCards"
    })
    public static class Warrant {

        @XmlElements({
            @XmlElement(name = "monetary", type = MonetaryCard.class),
            @XmlElement(name = "goto", type = GotoCard.class)
        })
        protected List<CardBase> warrantCards;

        /**
         * Gets the value of the warrantCards property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warrantCards property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarrantCards().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryCard }
         * {@link GotoCard }
         * 
         * 
         */
        public List<CardBase> getWarrantCards() {
            if (warrantCards == null) {
                warrantCards = new ArrayList<CardBase>();
            }
            return this.warrantCards;
        }

    }

}
