package com.example.networklastquzi2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.networklastquzi2.databinding.ActivityCountryBinding;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    ActivityCountryBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCountryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Argentina","ar","https://www.worldometers.info/img/flags/ar-flag.gif"));
        countries.add(new Country("Australia ","au","https://www.worldometers.info/img/flags/as-flag.gif"));
        countries.add(new Country("Austria","at","https://www.worldometers.info/img/flags/au-flag.gif"));
        countries.add(new Country("Belgium ","be","https://www.worldometers.info/img/flags/be-flag.gif"));
        countries.add(new Country("Brazil ","br","https://www.worldometers.info/img/flags/br-flag.gif"));
        countries.add(new Country("Bulgaria ","bg","https://www.worldometers.info/img/flags/bu-flag.gif"));
        countries.add(new Country("Canada ","ca","https://www.worldometers.info/img/flags/ca-flag.gif"));
        countries.add(new Country("China ","cn","https://www.worldometers.info/img/flags/ch-flag.gif"));
        countries.add(new Country("Colombia ","co","https://www.worldometers.info/img/flags/co-flag.gif"));
        countries.add(new Country("Cuba ","cu","https://www.worldometers.info/img/flags/cu-flag.gif"));
        countries.add(new Country("Czech Republic","cz","https://www.worldometers.info/img/flags/ez-flag.gif"));
        countries.add(new Country("Egypt ","eg","https://www.worldometers.info/img/flags/eg-flag.gif"));
        countries.add(new Country("France ","fr","https://www.worldometers.info/img/flags/fr-flag.gif"));
        countries.add(new Country("Germany ","de","https://www.worldometers.info/img/flags/gm-flag.gif"));
        countries.add(new Country("Greece ","gr","https://www.worldometers.info/img/flags/gr-flag.gif"));
        countries.add(new Country("Hong Kong","hk","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Flag_of_Hong_Kong.svg/1280px-Flag_of_Hong_Kong.svg.png"));
        countries.add(new Country("Hungary ","hu","https://www.worldometers.info/img/flags/hu-flag.gif"));
        countries.add(new Country("India","in","https://www.worldometers.info/img/flags/in-flag.gif"));
        countries.add(new Country("Indonesia ","id","https://www.worldometers.info/img/flags/id-flag.gif"));
        countries.add(new Country("Ireland ","ie","https://www.worldometers.info/img/flags/ei-flag.gif"));
        countries.add(new Country("Italy  ","it","https://www.worldometers.info/img/flags/it-flag.gif"));
        countries.add(new Country("Japan ","jp","https://www.worldometers.info/img/flags/ja-flag.gif"));
        countries.add(new Country("Latvia ","lv","https://www.worldometers.info/img/flags/lg-flag.gif"));
        countries.add(new Country("Lithuania ","lt","https://www.worldometers.info/img/flags/lh-flag.gif"));
        countries.add(new Country("Malaysia ","my","https://www.worldometers.info/img/flags/my-flag.gif"));
        countries.add(new Country("Mexico ","mx","https://www.worldometers.info/img/flags/mx-flag.gif"));
        countries.add(new Country("Morocco ","ma","https://www.worldometers.info/img/flags/mo-flag.gif"));
        countries.add(new Country("Netherlands ","nl","https://www.worldometers.info/img/flags/nl-flag.gif"));
        countries.add(new Country("New Zealand","nz","https://www.worldometers.info/img/flags/nz-flag.gif"));
        countries.add(new Country("Nigeria ","ng","https://www.worldometers.info/img/flags/ni-flag.gif"));
        countries.add(new Country("Norway ","no","https://www.worldometers.info/img/flags/no-flag.gif"));
        countries.add(new Country("Philippines ","ph","https://www.worldometers.info/img/flags/rp-flag.gif"));
        countries.add(new Country("Poland ","pl","https://www.worldometers.info/img/flags/pl-flag.gif"));
        countries.add(new Country("Portugal ","pt","https://www.worldometers.info/img/flags/po-flag.gif"));
        countries.add(new Country("Romania ","ro","https://www.worldometers.info/img/flags/ro-flag.gif"));
        countries.add(new Country("Russia ","ru","https://www.worldometers.info/img/flags/rs-flag.gif"));
        countries.add(new Country("Saudi Arabia","sa","https://www.worldometers.info/img/flags/sa-flag.gif"));
        countries.add(new Country("Serbia ","rs","https://www.worldometers.info/img/flags/ri-flag.gif"));
        countries.add(new Country("Singapore ","sg","https://www.worldometers.info/img/flags/sn-flag.gif"));
        countries.add(new Country("Slovakia ","sk","https://www.worldometers.info/img/flags/lo-flag.gif"));
        countries.add(new Country("Slovenia ","si","https://www.worldometers.info/img/flags/si-flag.gif"));
        countries.add(new Country("South Africa","za","https://www.worldometers.info/img/flags/sf-flag.gif"));
        countries.add(new Country("South Korea","kr","https://www.worldometers.info/img/flags/ks-flag.gif"));
        countries.add(new Country("Sweden ","se","https://www.worldometers.info/img/flags/sw-flag.gif"));
        countries.add(new Country("Switzerland ","ch","https://www.worldometers.info/img/flags/sz-flag.gif"));
        countries.add(new Country("Taiwan ","tw","https://cdn.countryflags.com/thumbs/taiwan/flag-800.png"));
        countries.add(new Country("Thailand ","th","https://www.worldometers.info/img/flags/th-flag.gif"));
        countries.add(new Country("Turkey ","tr","https://www.worldometers.info/img/flags/tu-flag.gif"));
        countries.add(new Country("United Arab Emirates","ae","https://www.worldometers.info/img/flags/ae-flag.gif"));
        countries.add(new Country("Ukraine ","ua","https://www.worldometers.info/img/flags/up-flag.gif"));
        countries.add(new Country("United Kingdom","gb","https://www.worldometers.info/img/flags/uk-flag.gif"));
        countries.add(new Country("United States","us","https://www.worldometers.info/img/flags/us-flag.gif"));
        countries.add(new Country("Venuzuela ","ve","https://www.worldometers.info/img/flags/ve-flag.gif"));



        CountryAdapter adapter =new CountryAdapter(countries, this, new OnItemCountryClick() {
            @Override
            public void OnItemCountryClick(Country country) {

                Intent intent =new Intent(getBaseContext(),MainActivityCategory.class);
                intent.putExtra("codeCountry",country.getCode());
                startActivity(intent);
            }
        });
        binding.rv.setAdapter(adapter);
        binding.rv.setHasFixedSize(true);
        binding.rv.setLayoutManager(new GridLayoutManager(this,2));

    }
}