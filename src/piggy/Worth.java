package piggy;

public abstract class Worth{
	int times;
	public Worth(){
		times = 1;
	}
	public Worth(int times){
		this.times *= times;
	}
	
	public int getTimes(){
		return times;
	}
	public int setTimes(int newtimes){
		int i = this.times * newtimes;
		return i; 
	}
	// @Override
	// public String toString(){
	// 	String back = "worth: "+ value;
	// 	return back;
	// }
}