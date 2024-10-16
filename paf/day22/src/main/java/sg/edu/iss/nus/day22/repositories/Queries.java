package sg.edu.iss.nus.day22.repositories;

public class Queries {

    public static final String SQL_INSERT_BFF = """
        insert into bff(email, name, dob, phone, comments)
        values(?, ?, ?, ?, ?)
    """;

    public static final String SQL_SELECT_BFF_BY_EMAIL = """
        select * from bff where email = ?
    """;

    public static final String SQL_COUNT_EMAIL = """
        select count(*) as email_count
            from bff
            where email = ?
    """;

    
    
}
