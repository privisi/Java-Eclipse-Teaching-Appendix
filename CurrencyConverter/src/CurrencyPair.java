
public class CurrencyPair {

	public String from, to;

	public CurrencyPair(String from, String to) {
		this.from = from.toLowerCase();
		this.to = to.toLowerCase();
	}
	
	// When you use HashMap.get(), the HashMap will use two things to compare the key: 
	
	// HashMaps automatically use hashCode() to compare objects we need to override and implement this.
	@Override
	public int hashCode()
	{
		// we add the hashCodes for both strings
	    return from.hashCode() + to.hashCode();
	}
	
	// HashMaps also automatically uses equals() to compare objects, but this compares addresses (location).
	// But locations / addresses are different for each object that we create.
	// So we will need to override it so that it will compare our object data rather than address.
	// (in this case, the object is CurrencyPair and we will compare from and to)
	@Override
	public boolean equals(Object obj) {
		// if both the object addresses are
		// referring to the same object.
		if (this == obj) {
			return true;
		}

		// is the other object null?
		if (obj == null) {
			return false;
		}
		
		// is the other object a CurrencyPair?
		if(obj.getClass() != this.getClass()) {
			return false;
		}

		// type casting of the object.
		CurrencyPair pair = (CurrencyPair) obj;

		// comparing the data of object with
		// the data of 'this' Object.
		return (pair.from.equals(this.from) && pair.to.equals(this.to));
	}

}
