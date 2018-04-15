package multiscrollview.thiyagu.com.multiscrollview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//Author : Thiyagu
//Email : thiyagu@programmer.net
//
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.customrecyclerview);
        recyclerView.setAdapter(new MainActivity.Adapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private int inputPosition = 8;
        private int itemCount     = 25;

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)

        {

            View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text, parent, false); //for 1
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scroll_data, parent, false); //for 2

            if (viewType == 1)

            {

                ViewHolder viewHolder = new ViewHolder(view1);
                return viewHolder;

            } else {
                ViewHolder viewHolder1 = new ViewHolder(view2);
                return viewHolder1;
            }
        }

        @Override
        public int getItemViewType(int position) {

            if (position == inputPosition) {

                return 2;


            } else {
                return 1;

            }
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return itemCount;
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View v) {
            super(v);

        }

    }
}
