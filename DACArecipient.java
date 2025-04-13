/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * @author Ethan Luong
 *  
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
<data, i.e. variables>
-----------------------------------------
<actions, i.e. methods>
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	String surname, givenName;
	String uscisNumber;
	String countryOfOrigin;
	int birthday, validFromDate, expirationDate; 
	char sex;

	public DACArecipient() {}

	/***** ACCESSORS *****/
	/**
     * Gets the surname.
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the given name.
     * @return the given name
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Gets the USCIS number.
     * @return the USCIS number
     */
    public String getUscisNumber() {
        return uscisNumber;
    }

    /**
     * Gets the country of origin.
     * @return the country of origin
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Gets the birthday.
     * @return the birthday (as a Julian Day number)
     */
    public int getBirthday() {
        return birthday;
    }

    /**
     * Gets the valid-from date.
     * @return the valid-from date (as a Julian Day number)
     */
    public int getValidFromDate() {
        return validFromDate;
    }

    /**
     * Gets the expiration date.
     * @return the expiration date (as a Julian Day number)
     */
    public int getExpirationDate() {
        return expirationDate;
    }

    /**
     * Gets the sex.
     * @return the sex ('M', 'F', etc.)
     */
    public char getSex() {
        return sex;
    }
	
	/***** MUTATORS *****/
    /**
     * Sets the surname.
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Sets the given name.
     * @param givenName the given name to set
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * Sets the USCIS number.
     * @param uscisNumber the USCIS number to set without "-"
     */
    public void setUscisNumber(int uscisNumber) {
		String copy = String.valueOf(uscisNumber);
        this.uscisNumber = addHyphens(uscisNumber);
    }

	/**
     * Adds hyphens to the USCIS number.
     * @param uscisNumber the USCIS number to set without "-"
     */
	private String addHyphens(int uscisNumber) {
		String copy = String.valueOf(uscisNumber);
        return copy.substring(0, 2) + "-" + copy.substring(2, 3) + "-" + copy.substring(3, copy.length()-1);
	}

    /**
     * Sets the country of origin.
     * @param countryOfOrigin the country of origin to set
     */
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * Sets the birthday.
     * @param birthday the birthday to set (as a Julian Day number)
     */
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    /**
     * Sets the valid-from date.
     * @param validFromDate the valid-from date to set (as a Julian Day number)
     */
    public void setValidFromDate(int validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * Sets the expiration date.
     * @param expirationDate the expiration date to set (as a Julian Day number)
     */
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Sets the sex.
     * @param sex the sex to set ('M', 'F', etc.)
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * Sets all fields of the ImmigrationRecord at once.
     * @param surname the surname
     * @param givenName the given name
     * @param uscisNumber the USCIS number
     * @param countryOfOrigin the country of origin
     * @param birthday the birthday (as a Julian Day number)
     * @param validFromDate the valid-from date (as a Julian Day number)
     * @param expirationDate the expiration date (as a Julian Day number)
     * @param sex the sex ('M', 'F', etc.)
     */
    public void setAll(String surname, String givenName, int uscisNumber,
                       String countryOfOrigin, int birthday, int validFromDate,
                       int expirationDate, char sex) {
        this.surname = surname;
        this.givenName = givenName;
        this.uscisNumber = addHyphens(uscisNumber);;
        this.countryOfOrigin = countryOfOrigin;
        this.birthday = birthday;
        this.validFromDate = validFromDate;
        this.expirationDate = expirationDate;
        this.sex = sex;
    }

}