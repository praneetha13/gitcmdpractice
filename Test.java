class NegativeAgeException extends Exception{
	
	NegativeAgeException(String s){
        super(s);
	}
}

class Test1{
	public void do(int age)throws NegativeAgeException{
		if(age<18)
         throw new NegativeAgeException("not eligible to vote");
	    else
			System.out.println("Not Eligible to vote");
	}
}

class Test {
	public static void main(String[] args){
        try{
			Test1 t=new Test1();
			t1.do(12);
		}
		catch(NegativeAgeException e){
          System.out.println(e);
		}
	}
}
class NegativeAgeException extends RuntimeException {
    NegativeAgeException(String s) {
        super(s);
    }
}

class Test1 {
    public void doSomething(int age) throws NegativeAgeException {
        if (age < 18)
            throw new NegativeAgeException("not eligible to vote");
        else
            System.out.println("Not Eligible to vote");
    }
}

class Test {
    public static void main(String[] args) {
        try {
            Test1 t = new Test1();
            t.doSomething(12);
        } catch (NegativeAgeException e) {
            System.out.println(e);
        }
    }
}
