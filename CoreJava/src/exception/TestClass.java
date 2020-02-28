package exception;

public class TestClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try{
			
			throw new Exception("tt");
			
		}catch(Exception e){
			
			throw new Exception("ttt");
		}finally{
			throw new Exception("pppppppppppppppppppppp");
		}

	}

}
