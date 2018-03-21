package com.jcg;

/**
 * @author ashraf
 *
 */
public class Student {
	
	private long id;
	private String firstName;
	private String lastName;
	private String recordType;
	private String gender;
	private int age;
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param recordType
	 * @param gender
	 * @param age
	 */
	public Student(long id, String firstName, String lastName, String recordType, String gender,
			int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recordType = recordType;
		this.gender = gender;
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}/**
	 * @return the lastName
	 */
	public String getrecordType() {
		return recordType;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setrecordType(String recordType) {
		this.recordType = recordType;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the number of items
	 */
	public int getCount()
	{
		return this.getCount();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", recordType=" + recordType + ", gender=" + gender + ", age="
				+ age + "]";
	}
}