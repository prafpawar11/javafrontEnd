package ServletData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CreateAccountDeo {

	
	public int validate(CreateAccountPOJO createaccountPOJO) throws ClassNotFoundException {
		
		int result=0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/softtech?useSSL=false", "root", "Pr@ful0812");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into employees values (?,?,?,?,?,?,?,?,?,?,?)")) {
			
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, createaccountPOJO.getFirstName());
			preparedStatement.setString(3, createaccountPOJO.getMname());
			preparedStatement.setString(4, createaccountPOJO.getLastname());
			preparedStatement.setString(5, createaccountPOJO.getDOB());
			
			preparedStatement.setString(6, createaccountPOJO.getEmail());
			preparedStatement.setString(7, createaccountPOJO.getMobno());
			preparedStatement.setString(8, createaccountPOJO.getGender());
			preparedStatement.setString(9, createaccountPOJO.getAdd());
			preparedStatement.setString(10, createaccountPOJO.getCountry());
			preparedStatement.setString(11, createaccountPOJO.getSsn());
			
			preparedStatement.executeUpdate();
			
			
				} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		return result;
	}
}
