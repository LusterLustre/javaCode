package exam;

public class afterQuiz2 {

	public boolean list_of_tel(String[] tel_list) {
        boolean answer = true;
        
        for(int i = 0; i < tel_list.length; i++){
            for(int j = 0; j < tel_list.length; j++){
                if(i == j) continue;
                if(tel_list[j].indexOf(tel_list[i]) == 0){//접두어라면
                    return false;   
                }
            }
        }
        
        return answer;
    }

}
