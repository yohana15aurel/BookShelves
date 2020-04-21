package android.example.bookshelves;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayout title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //title = findViewById(R.id.textTitle);

        RecyclerView BookView = findViewById(R.id.BookView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        BookView.setLayoutManager(gridLayoutManager);

        List<Book_item> book_items = new ArrayList<>();

        book_items.add(
                new Book_item("Dutch", getResources().getString(R.string.author), getResources().getString(R.string.year), getResources().getString(R.string.rating)));
        book_items.add(
                new Book_item("Dutch", getResources().getString(R.string.author), getResources().getString(R.string.year), getResources().getString(R.string.rating)));
        book_items.add(
                new Book_item("Dutch", getResources().getString(R.string.author), getResources().getString(R.string.year), getResources().getString(R.string.rating)));

        BookView.setAdapter(new Book_item_adapter(book_items));

//        title.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Read_book.class);
//                startActivity(intent);
//            }
//        });
    }
}