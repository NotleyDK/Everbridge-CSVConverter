package com.jcg;

/**
 * @author ashraf
 *
 */
public class CustomerCSVImport {
	
	private String firstName;
	private String lastName;
	private String externalId;
	private String recordType;
	private String country;
	private String phone1;
	private String phoneCountry1;
	private String phone2;
	private String phoneCountry2;
	private String phone3;
	private String phoneCountry3;
	private String phone4;
	private String phoneCountry4;
	private String phone5;
	private String phoneCountry5;
	private String phone6;
	private String phoneCountry6;
	private String emailAddress1;
	private String emailAddress2;
	private String emailAddress3;
	private String businessName;
	private String groups;
	private String ssouserId;
	private String groupRemove;
	private String travelArranger;
	private String location1;
	private String streetAddress1;
	private String aptsuiteuUnit1;
	private String city1;
	private String stateProvince1;
	private String postalCode1;
	private String country1;
	private String locationId1;
	private String location2;
	private String streetAddress2;
	private String aptsuiteUnit2;
	private String city2;
	private String stateProvince2;
	private String postalCode2;
	private String country2;
	private String locationId2;
	private String sms1;
	private String sms1Country;
	private String sms2;
	private String sms2Country;
	private String customField1;
	private String customValue1;
	private String customField2;
	private String customValue2;
	private String customField3;
	private String customValue3;
	private String customField4;
	private String customValue4;
/*	
 * Selection of parameters that are not yet required
	
	private String latitude1;
	private String longitude1;
	private String latitude2;
	private String longitude2;
	private String middleInitial;
	private String suffix;
	private String fax1;
	private String faxCountry1;
	private String fax2;
	private String faxCountry2;
	private String fax3;
	private String faxCountry3;
	private String tty1;
	private String ttyCountry1;
	private String tty2;
	private String ttyCountry2;
	private String tty3;
	private String ttyCountry3;
	private String numericPager;
	private String numericpagerCountry;
	private String numericpagerPin;
	private String numericpagerService;
	private String tapPager;
	private String tappagerCountry;
	private String tappagerPin;
	private String onewaySms;
	private String onewaysmsCountry;
	private String extensionPhone1;
    private String extension1;
	private String extensionphoneCountry1;
	private String extensionPhone2;
	private String extension2;
	private String extensionphoneCountry2;
	private String extensionPhone3;
	private String extension3;
	private String extensionphoneCountry3;
	private String extensionPhone4;
	private String extension4;
	private String extensionphoneCountry4;
	private String extensionPhone5;
	private String extension5;
	private String extensionphoneCountry5;
*/

	/**
	 * @param externalId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param age
	 * 
	 */
	public CustomerCSVImport(String firstName, String lastName, String externalId, String recordType, 
			String country, String phone1, String phoneCountry1, String phone2, String phoneCountry2, 
			String phone3, String phoneCountry3, String phone4, String phoneCountry4, String phone5, 
			String phoneCountry5, String phone6, String phoneCountry6, String emailAddress1, String emailAddress2, 
			String emailAddress3, String businessName, String groups, String ssouserId, String groupRemove, 
			String travelArranger, String location1, String streetAddress1, String aptsuiteuUnit1, String city1, 
			String stateProvince1, String postalCode1, String country1, String locationId1, String location2, 
			String streetAddress2, String aptsuiteUnit2, String city2, String stateProvince2, String postalCode2, 
			String country2, String locationId2, String sms1, String sms1Country, String sms2, String sms2Country, 
			String customField1, String customValue1, String customField2, String customValue2, 
			String customField3, String customValue3, String customField4, String customValue4) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.externalId = externalId;
		this.recordType = recordType;
		this.country = country;
		this.phone1 = phone1;
		this.phoneCountry1 = phoneCountry1;
		this.phone2 = phone2;
		this.phoneCountry2 = phoneCountry2;
		this.phone3 = phone3;
		this.phoneCountry3 = phoneCountry3;
		this.phone4 = phone4;
		this.phoneCountry4 = phoneCountry4;
		this.phone5 = phone5;
		this.phoneCountry5 = phoneCountry5;
		this.phone6 = phone6;
		this.phoneCountry6 = phoneCountry6;
		this.emailAddress1 = emailAddress1;
		this.emailAddress2 = emailAddress2;
		this.emailAddress3 = emailAddress3;
		this.businessName = businessName;
		this.groups = groups;
		this.ssouserId = ssouserId;
		this.groupRemove = groupRemove;
		this.travelArranger = travelArranger;
		this.location1 = location1;
		this.streetAddress1 = streetAddress1;
		this.aptsuiteuUnit1 = aptsuiteuUnit1;
		this.city1 = city1;
		this.stateProvince1 = stateProvince1;
		this.postalCode1 = postalCode1;
		this.country1 = country1;
		this.locationId1 = locationId1;
		this.location2 = location2;
		this.streetAddress2 = streetAddress2;
		this.aptsuiteUnit2 = aptsuiteUnit2;
		this.city2 = city2;
		this.stateProvince2 = stateProvince2;
		this.postalCode2 = postalCode2;
		this.country2 = country2;
		this.locationId2 = locationId2;
		this.sms1 = sms1;
		this.sms1Country = sms1Country;
		this.sms2 = sms2;
		this.sms2Country = sms2Country;
		this.customField1 = customField1;
		this.customValue1 = customValue1;
		this.customField2 = customField2;
		this.customValue2 = customValue2;
		this.customField3 = customField3;
		this.customValue3 = customValue3;
		this.customField4 = customField4;
		this.customValue4 = customValue4;
	}
	
	//SET PARAMETER VALUES
	/*
	* @return firstName
	*/
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	* @return lastName
	*/
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	* @return externalId
	*/
	public void setexternalId(String externalId) {
		this.externalId = externalId;
	}

	/*
	* @return recordType
	*/
	public void setrecordType(String recordType) {
		this.recordType = recordType;
	}

	/*
	* @return country
	*/
	public void setcountry(String country) {
		this.country = country;
	}

	/*
	* @return phone1
	*/
	public void setphone1(String phone1) {
		this.phone1 = phone1;
	}

	/*
	* @return phoneCountry1
	*/
	public void setphoneCountry1(String phoneCountry1) {
		this.phoneCountry1 = phoneCountry1;
	}

	/*
	* @return phone2
	*/
	public void setphone2(String phone2) {
		this.phone2 = phone2;
	}

	/*
	* @return phoneCountry2
	*/
	public void setphoneCountry2(String phoneCountry2) {
		this.phoneCountry2 = phoneCountry2;
	}

	/*
	* @return phone3
	*/
	public void setphone3(String phone3) {
		this.phone3 = phone3;
	}

	/*
	* @return phoneCountry3
	*/
	public void setphoneCountry3(String phoneCountry3) {
		this.phoneCountry3 = phoneCountry3;
	}

	/*
	* @return phone4
	*/
	public void setphone4(String phone4) {
		this.phone4 = phone4;
	}

	/*
	* @return phoneCountry4
	*/
	public void setphoneCountry4(String phoneCountry4) {
		this.phoneCountry4 = phoneCountry4;
	}

	/*
	* @return phone5
	*/
	public void setphone5(String phone5) {
		this.phone5 = phone5;
	}

	/*
	* @return phoneCountry5
	*/
	public void setphoneCountry5(String phoneCountry5) {
		this.phoneCountry5 = phoneCountry5;
	}

	/*
	* @return phone6
	*/
	public void setphone6(String phone6) {
		this.phone6 = phone6;
	}

	/*
	* @return phoneCountry6
	*/
	public void setphoneCountry6(String phoneCountry6) {
		this.phoneCountry6 = phoneCountry6;
	}

	/*
	* @return emailAddress1
	*/
	public void setemailAddress1(String emailAddress1) {
		this.emailAddress1 = emailAddress1;
	}

	/*
	* @return emailAddress2
	*/
	public void setemailAddress2(String emailAddress2) {
		this.emailAddress2 = emailAddress2;
	}

	/*
	* @return emailAddress3
	*/
	public void setemailAddress3(String emailAddress3) {
		this.emailAddress3 = emailAddress3;
	}

	/*
	* @return businessName
	*/
	public void setbusinessName(String businessName) {
		this.businessName = businessName;
	}

	/*
	* @return groups
	*/
	public void setgroups(String groups) {
		this.groups = groups;
	}

	/*
	* @return ssouserId
	*/
	public void setssouserId(String ssouserId) {
		this.ssouserId = ssouserId;
	}

	/*
	* @return groupRemove
	*/
	public void setgroupRemove(String groupRemove) {
		this.groupRemove = groupRemove;
	}

	/*
	* @return travelArranger
	*/
	public void settravelArranger(String travelArranger) {
		this.travelArranger = travelArranger;
	}

	/*
	* @return location1
	*/
	public void setlocation1(String location1) {
		this.location1 = location1;
	}

	/*
	* @return streetAddress1
	*/
	public void setstreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	/*
	* @return aptsuiteuUnit1
	*/
	public void setaptsuiteuUnit1(String aptsuiteuUnit1) {
		this.aptsuiteuUnit1 = aptsuiteuUnit1;
	}

	/*
	* @return city1
	*/
	public void setcity1(String city1) {
		this.city1 = city1;
	}

	/*
	* @return stateProvince1
	*/
	public void setstateProvince1(String stateProvince1) {
		this.stateProvince1 = stateProvince1;
	}

	/*
	* @return postalCode1
	*/
	public void setpostalCode1(String postalCode1) {
		this.postalCode1 = postalCode1;
	}

	/*
	* @return country1
	*/
	public void setcountry1(String country1) {
		this.country1 = country1;
	}

	/*
	* @return locationId1
	*/
	public void setlocationId1(String locationId1) {
		this.locationId1 = locationId1;
	}

	/*
	* @return location2
	*/
	public void setlocation2(String location2) {
		this.location2 = location2;
	}

	/*
	* @return streetAddress2
	*/
	public void setstreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	/*
	* @return aptsuiteUnit2
	*/
	public void setaptsuiteUnit2(String aptsuiteUnit2) {
		this.aptsuiteUnit2 = aptsuiteUnit2;
	}

	/*
	* @return city2
	*/
	public void setcity2(String city2) {
		this.city2 = city2;
	}

	/*
	* @return stateProvince2
	*/
	public void setstateProvince2(String stateProvince2) {
		this.stateProvince2 = stateProvince2;
	}

	/*
	* @return postalCode2
	*/
	public void setpostalCode2(String postalCode2) {
		this.postalCode2 = postalCode2;
	}

	/*
	* @return country2
	*/
	public void setcountry2(String country2) {
		this.country2 = country2;
	}

	/*
	* @return locationId2
	*/
	public void setlocationId2(String locationId2) {
		this.locationId2 = locationId2;
	}

	/*
	* @return sms1
	*/
	public void setsms1(String sms1) {
		this.sms1 = sms1;
	}

	/*
	* @return sms1Country
	*/
	public void setsms1Country(String sms1Country) {
		this.sms1Country = sms1Country;
	}

	/*
	* @return sms2
	*/
	public void setsms2(String sms2) {
		this.sms2 = sms2;
	}

	/*
	* @return sms2Country
	*/
	public void setsms2Country(String sms2Country) {
		this.sms2Country = sms2Country;
	}

	/*
	* @return customField1
	*/
	public void setcustomField1(String customField1) {
		this.customField1 = customField1;
	}

	/*
	* @return customValue1
	*/
	public void setcustomValue1(String customValue1) {
		this.customValue1 = customValue1;
	}

	/*
	* @return customField2
	*/
	public void setcustomField2(String customField2) {
		this.customField2 = customField2;
	}

	/*
	* @return customValue2
	*/
	public void setcustomValue2(String customValue2) {
		this.customValue2 = customValue2;
	}

	/*
	* @return customField3
	*/
	public void setcustomField3(String customField3) {
		this.customField3 = customField3;
	}

	/*
	* @return customValue3
	*/
	public void setcustomValue3(String customValue3) {
		this.customValue3 = customValue3;
	}

	/*
	* @return customField4
	*/
	public void setcustomField4(String customField4) {
		this.customField4 = customField4;
	}

	/*
	* @return customValue4
	*/
	public void setcustomValue4(String customValue4) {
		this.customValue4 = customValue4;
	}
	
	//GET PARAMETER VALUES
	/*
	* @return firstName
	*/
	public String getfirstName() {
		return firstName;
	}

	/*
	* @return lastName
	*/
	public String getlastName() {
		return lastName;
	}

	/*
	* @return externalId
	*/
	public String getexternalId() {
		return externalId;
	}

	/*
	* @return recordType
	*/
	public String getrecordType() {
		return recordType;
	}

	/*
	* @return country
	*/
	public String getcountry() {
		return country;
	}

	/*
	* @return phone1
	*/
	public String getphone1() {
		return phone1;
	}

	/*
	* @return phoneCountry1
	*/
	public String getphoneCountry1() {
		return phoneCountry1;
	}

	/*
	* @return phone2
	*/
	public String getphone2() {
		return phone2;
	}

	/*
	* @return phoneCountry2
	*/
	public String getphoneCountry2() {
		return phoneCountry2;
	}

	/*
	* @return phone3
	*/
	public String getphone3() {
		return phone3;
	}

	/*
	* @return phoneCountry3
	*/
	public String getphoneCountry3() {
		return phoneCountry3;
	}

	/*
	* @return phone4
	*/
	public String getphone4() {
		return phone4;
	}

	/*
	* @return phoneCountry4
	*/
	public String getphoneCountry4() {
		return phoneCountry4;
	}

	/*
	* @return phone5
	*/
	public String getphone5() {
		return phone5;
	}

	/*
	* @return phoneCountry5
	*/
	public String getphoneCountry5() {
		return phoneCountry5;
	}

	/*
	* @return phone6
	*/
	public String getphone6() {
		return phone6;
	}

	/*
	* @return phoneCountry6
	*/
	public String getphoneCountry6() {
		return phoneCountry6;
	}

	/*
	* @return emailAddress1
	*/
	public String getemailAddress1() {
		return emailAddress1;
	}

	/*
	* @return emailAddress2
	*/
	public String getemailAddress2() {
		return emailAddress2;
	}

	/*
	* @return emailAddress3
	*/
	public String getemailAddress3() {
		return emailAddress3;
	}

	/*
	* @return businessName
	*/
	public String getbusinessName() {
		return businessName;
	}

	/*
	* @return groups
	*/
	public String getgroups() {
		return groups;
	}

	/*
	* @return ssouserId
	*/
	public String getssouserId() {
		return ssouserId;
	}

	/*
	* @return groupRemove
	*/
	public String getgroupRemove() {
		return groupRemove;
	}

	/*
	* @return travelArranger
	*/
	public String gettravelArranger() {
		return travelArranger;
	}

	/*
	* @return location1
	*/
	public String getlocation1() {
		return location1;
	}

	/*
	* @return streetAddress1
	*/
	public String getstreetAddress1() {
		return streetAddress1;
	}

	/*
	* @return aptsuiteuUnit1
	*/
	public String getaptsuiteuUnit1() {
		return aptsuiteuUnit1;
	}

	/*
	* @return city1
	*/
	public String getcity1() {
		return city1;
	}

	/*
	* @return stateProvince1
	*/
	public String getstateProvince1() {
		return stateProvince1;
	}

	/*
	* @return postalCode1
	*/
	public String getpostalCode1() {
		return postalCode1;
	}

	/*
	* @return country1
	*/
	public String getcountry1() {
		return country1;
	}

	/*
	* @return locationId1
	*/
	public String getlocationId1() {
		return locationId1;
	}

	/*
	* @return location2
	*/
	public String getlocation2() {
		return location2;
	}

	/*
	* @return streetAddress2
	*/
	public String getstreetAddress2() {
		return streetAddress2;
	}

	/*
	* @return aptsuiteUnit2
	*/
	public String getaptsuiteUnit2() {
		return aptsuiteUnit2;
	}

	/*
	* @return city2
	*/
	public String getcity2() {
		return city2;
	}

	/*
	* @return stateProvince2
	*/
	public String getstateProvince2() {
		return stateProvince2;
	}

	/*
	* @return postalCode2
	*/
	public String getpostalCode2() {
		return postalCode2;
	}

	/*
	* @return country2
	*/
	public String getcountry2() {
		return country2;
	}

	/*
	* @return locationId2
	*/
	public String getlocationId2() {
		return locationId2;
	}

	/*
	* @return sms1
	*/
	public String getsms1() {
		return sms1;
	}

	/*
	* @return sms1Country
	*/
	public String getsms1Country() {
		return sms1Country;
	}

	/*
	* @return sms2
	*/
	public String getsms2() {
		return sms2;
	}

	/*
	* @return sms2Country
	*/
	public String getsms2Country() {
		return sms2Country;
	}

	/*
	* @return customField1
	*/
	public String getcustomField1() {
		return customField1;
	}

	/*
	* @return customValue1
	*/
	public String getcustomValue1() {
		return customValue1;
	}

	/*
	* @return customField2
	*/
	public String getcustomField2() {
		return customField2;
	}

	/*
	* @return customValue2
	*/
	public String getcustomValue2() {
		return customValue2;
	}

	/*
	* @return customField3
	*/
	public String getcustomField3() {
		return customField3;
	}

	/*
	* @return customValue3
	*/
	public String getcustomValue3() {
		return customValue3;
	}

	/*
	* @return customField4
	*/
	public String getcustomField4() {
		return customField4;
	}

	/*
	* @return customValue4
	*/
	public String getcustomValue4() {
		return customValue4;
	}
	
	
	@Override
	public String toString() {
		return "RECORD 	[firstName=" + firstName + ", lastName=" + lastName + ", externalId=" 
	+ externalId + ", recordType=" + recordType + ", country=" + country + ", phone1=" + phone1 
	+ ", phoneCountry1=" + phoneCountry1 + ", phone2=" + phone2 + ", phoneCountry2=" + phoneCountry2 
	+ ", phone3=" + phone3 + ", phoneCountry3=" + phoneCountry3 + ", phone4=" + phone4 + ", phoneCountry4=" 
	+ phoneCountry4 + ", phone5=" + phone5 + ", phoneCountry5=" + phoneCountry5 + ", phone6=" + phone6 
	+ ", phoneCountry6=" + phoneCountry6 + ", emailAddress1=" + emailAddress1 + ", emailAddress2=" 
	+ emailAddress2 + ", emailAddress3=" + emailAddress3 + ", businessName=" + businessName + ", groups=" 
	+ groups + ", ssouserId=" + ssouserId + ", groupRemove=" + groupRemove + ", travelArranger=" 
	+ travelArranger + ", location1=" + location1 + ", streetAddress1=" + streetAddress1 + ", aptsuiteuUnit1=" 
	+ aptsuiteuUnit1 + ", city1=" + city1 + ", stateProvince1=" + stateProvince1 + ", postalCode1=" + postalCode1 
	+ ", country1=" + country1 + ", locationId1=" + locationId1 + ", location2=" + location2 
	+ ", streetAddress2=" + streetAddress2 + ", aptsuiteUnit2=" + aptsuiteUnit2 + ", city2=" + city2 
	+ ", stateProvince2=" + stateProvince2 + ", postalCode2=" + postalCode2 + ", country2=" + country2 
	+ ", locationId2=" + locationId2 + ", sms1=" + sms1 + ", sms1Country=" + sms1Country + ", sms2=" 
	+ sms2 + ", sms2Country=" + sms2Country + ", customField1=" + customField1 + ", customValue1=" 
	+ customValue1 + ", customField2=" + customField2 + ", customValue2=" + customValue2 + ", customField3=" 
	+ customField3 + ", customValue3=" + customValue3 + ", customField4=" + customField4 + ", customValue4=" 
	+ customValue4 + "]";
	}
}