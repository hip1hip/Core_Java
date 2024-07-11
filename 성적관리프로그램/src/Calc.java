
public class Calc {
	//배열을 받을 필드가 필요함 
	private Student [] array; //field
	public Calc(Student[] array) {
		this.array = array;  // 이미 학번 점수 등으 다 들어간 array 
	}
	void calc() {  //계산은 여기서 
		for(Student std :this.array ) { 
			int tot = std.getKor() + std.getEng() + std.getMat()+ std.getEdp();
			double avg = tot /4 ;
			char grade = (avg >= 90)? 'A':
							(avg >=80)? 'B' :
								(avg >= 70)? 'C' :
									(avg >= 60)? 'D' : 'F';
			std.setTot(tot); std.setAvg(avg); std.setGrade(grade);
		}
	}

}
