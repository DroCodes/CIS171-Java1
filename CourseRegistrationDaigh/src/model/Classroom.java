package model;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 15, 2023
* MacOS 13.2
*/
public class Classroom {
	private String building;
	private String roomNumber;
	private String campus;
	private String type;
	private int capacity;
	
	public Classroom() {}
	
	public Classroom(String building, String roomNumber, String campus, String type, int capacity) {
		setBuilding(building);
		setRoomNumber(roomNumber);
		setCampus(campus);
		setType(type);
		setCapacity(capacity);
	}
	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}
	/**
	 * @param building the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}
	/**
	 * @return the roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the campus
	 */
	public String getCampus() {
		return campus;
	}
	/**
	 * @param campus the campus to set
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "building = " + building + ", roomNumber = " + roomNumber + ", campus = " + campus + ", type = "
				+ type + ", capacity = " + capacity;
	}
	
	
	
}
