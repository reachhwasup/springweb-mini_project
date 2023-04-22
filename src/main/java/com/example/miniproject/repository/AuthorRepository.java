package com.example.miniproject.repository;

import com.example.miniproject.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AuthorRepository {
    private List<Author> authors = new ArrayList<>(){{
        add(new Author(101,"Cristiano Ronaldo dos Santos Aveiro","@cr7","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Cristiano_Ronaldo_2018.jpg/330px-Cristiano_Ronaldo_2018.jpg" ,"https://therealchamps.com/wp-content/uploads/getty-images/2017/07/947096288.jpeg","Cristiano Ronaldo dos Santos Aveiro GOIH ComM born 5 February 1985 is a Portuguese professional footballer who plays as a forward for and captains both Saudi Professional League club Al Nassr and the Portugal national team. "));
        add(new Author(102,"Lionel Andrés Messi","@leo_messi","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Lionel-Messi-Argentina-2022-FIFA-World-Cup_%28cropped%29.jpg/330px-Lionel-Messi-Argentina-2022-FIFA-World-Cup_%28cropped%29.jpg" ,"https://media.cnn.com/api/v1/images/stellar/prod/210201103122-lionel-messi-barcelona.jpg?q=x_248,y_0,h_2999,w_3999,c_crop","Lionel Andrés Messi born 24 June 1987, also known as Leo Messi, is an Argentine professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and captains the Argentina national team."));
        add(new Author(103,"Neymar da Silva Santos Júnior","@neymar_jr","https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg/330px-20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg" ,"https://www.citizen.co.za/wp-content/uploads/2022/09/Neymar-3-scaled.jpg","Neymar da Silva Santos Júnior (born 5 February 1992), known mononymously as Neymar, is a Brazilian professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and the Brazil national team."));
        add(new Author(104,"Ángel Fabián Di María","@di_maria","https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/NIG-ARG_%285%29.jpg/330px-NIG-ARG_%285%29.jpg" ,"https://www.fcbarcelonanoticias.com/uploads/s1/13/01/04/8/maria-barca-opcion.jpeg","Ángel Fabián Di María (born 14 February 1988) is an Argentine professional footballer who plays for Serie A club Juventus and the Argentina national team. He can play as either a winger or attacking midfielder."));


    }} ;

    public List<Author> getAllAuthor(){
        return authors;
    }

}
