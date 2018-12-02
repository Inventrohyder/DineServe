package community.minerva.dineserve;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

class RestaurantAdapter extends ArrayAdapter {


    RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Restaurant currentRestaurant = (Restaurant) getItem(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);

        String formattedMagnitude = formatMagnitude(currentRestaurant.getMagnitude());
        magnitudeView.setText(formattedMagnitude);

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();

        int magnitudeColor = getMagnitudeColor(currentRestaurant.getMagnitude());
        magnitudeCircle.setColor(magnitudeColor);

        String restaurantName = currentRestaurant.getName();
        String distanceAway = String.valueOf(currentRestaurant.getDistance());
        String tables = String.valueOf(currentRestaurant.getTables());

        TextView restaurantNameView = (TextView) listItemView.findViewById(R.id.resturant_name);
        restaurantNameView.setText(restaurantName);

        TextView distanceAwayView = (TextView) listItemView.findViewById(R.id.distance_away);
        distanceAwayView.setText(distanceAway);

        TextView tablesView = (TextView) listItemView.findViewById(R.id.tables_available);
        tablesView.setText(tables);

        return listItemView;
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
        }

        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }

    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

}
