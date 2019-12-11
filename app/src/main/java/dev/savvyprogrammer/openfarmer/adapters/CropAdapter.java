package dev.savvyprogrammer.openfarmer.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import dev.savvyprogrammer.openfarmer.R;
import dev.savvyprogrammer.openfarmer.model.Crop;


public class CropAdapter extends RecyclerView.Adapter<CropAdapter.MyViewHolder> {

    private CropAdapter.OnCropClickListener listener;
    private List<Crop> cropList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView cropName;
        ImageView cropImage;


        MyViewHolder(View itemView) {
            super(itemView);
            cropImage = itemView.findViewById(R.id.crop_image);
            cropName = itemView.findViewById(R.id.crop_name);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            listener.onCropClick(getAdapterPosition());
        }
    }

    public CropAdapter(List<Crop> cropList, CropAdapter.OnCropClickListener listener) {
        this.listener = listener;
        this.cropList = cropList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.crop_card_item, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        Crop crop = cropList.get(position);
        holder.cropName.setText(crop.getText());
        Picasso.get().load(crop.getCropImage()).into(holder.cropImage);
    }
    @Override
    public int getItemCount() {
        return cropList.size();
    }

    public interface OnCropClickListener {
        void onCropClick(int position);
    }
}