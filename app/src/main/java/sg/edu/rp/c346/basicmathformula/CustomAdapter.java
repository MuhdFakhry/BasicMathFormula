package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15007803 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int Layout_id;
    ArrayList<BasicFormula> FormulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BasicFormula> objects) {
        super(context, resource, objects);
        parent_context = context;
        Layout_id = resource;
        FormulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(Layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        BasicFormula currentItem = FormulaList.get(position);
        String name = currentItem.getShape();
        String date = currentItem.getFormula();
        String type = currentItem.getType();
        tvName.setText(name);
        tvDate.setText(date);
        tvType.setText(type);
        return rowView;

    }
}
