package zhangzhenxiong.tool.mongodb.model;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class User {
	@Id 
	private String userId;
	
	public String firstName;
	public String lastName;	

}
