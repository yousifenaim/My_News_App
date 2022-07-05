package com.example.networklastquzi2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    ArrayList<Country> countries ;
    OnItemCountryClick OnItemCountryClick ;
    Context context;

    public CountryAdapter(ArrayList<Country> countries,Context context,  OnItemCountryClick OnItemCountryClick) {
        this.countries = countries;
        this.context=context;
        this.OnItemCountryClick = OnItemCountryClick;

    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custm_country,parent,false);
        CountryViewHolder  countryViewHolder =new CountryViewHolder(view);
        return countryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        Country country =countries.get(position);
        holder.name.setText(country.getName());
        Glide.with(context).load(country.getImage()).into(holder.imageCountry);
        holder.country=country;
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder{

        ImageView imageCountry;
        TextView name ;
        Country country ;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCountry =itemView.findViewById(R.id.image_country);
            name =itemView.findViewById(R.id.tv_name_country);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    OnItemCountryClick.OnItemCountryClick(country);
                }
            });
        }
    }
}

