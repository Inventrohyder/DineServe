package community.minerva.dineserve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));
        restaurants.add(new Restaurant("Pakwan", 0.4, 2.3, 8));

        RestaurantAdapter adapter = new RestaurantAdapter(this,restaurants);

        ListView listView = findViewById(R.id.restaurants);
        listView.setAdapter(adapter);
    }
}
