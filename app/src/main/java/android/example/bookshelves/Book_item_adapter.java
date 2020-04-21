package android.example.bookshelves;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Book_item_adapter extends RecyclerView.Adapter<Book_item_adapter.BookItemViewHolder>{
    private List<Book_item> book_items;
    private Context context;

    public Book_item_adapter(Context context, List<Book_item> book_items) {
        this.context = context;
        this.book_items = book_items;
    }

    @NonNull
    @Override
    public BookItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookItemViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item_list,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull BookItemViewHolder holder, int position) {
        holder.textTitle.setText(book_items.get(position).getTitle());
        holder.author.setText(book_items.get(position).getDescription());
        holder.year.setText(book_items.get(position).getYear());
        holder.rating.setText(book_items.get(position).getRating());

        holder.textTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "{}";
                Intent intent = new Intent(context,Read_book.class);
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }});
    }

    @Override
    public int getItemCount() {
        return book_items.size();
    }

    Book_item_adapter(List<Book_item> book_items) {
        this.book_items = book_items;
    }

    class BookItemViewHolder extends RecyclerView.ViewHolder{
        private TextView textTitle, author, year, rating;

        public BookItemViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            author = itemView.findViewById(R.id.Author);
            year = itemView.findViewById(R.id.year);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}
