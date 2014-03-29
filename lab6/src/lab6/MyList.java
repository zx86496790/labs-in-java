package lab6;

public class MyList {
	Object[] object;
	int counter=0;
	int size=0;

	MyList(int size) {
		this.size=size;
		object = new Object[size];
	}

	void append(Object o) throws ListFullException{
		if(counter+1<=size)
		{
			object[counter]=o;
			counter++;
		}
		else
		{
			throw new ListFullException();
		}
		
	}

	Object at(int index) {
		Object temp=null;
		if(index<0||index>counter)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			temp=object[index];
		}
		return temp;
	}

	void remove(int index) {
		if(index<0||index>counter)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			for(int i=index;i<counter;i++)
			{
				object[i]=object[i+1];
				counter--;
			}
		}
	}
}
