package fr.loulou.app9.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import fr.loulou.app9.R;
import fr.loulou.app9.models.RobotsItem;

public class RobotsItemAdapter extends BaseAdapter {

    // FIELDS (Attributs) de la classe qui est notre adapter
    // ACTIVITE = CONTEXT + INTERFACE GRAPHIQUE
    private Context context;
    private List<RobotsItem> robotsItemList;
    private LayoutInflater inflater;

    // CONSTRUCTEUR
    public RobotsItemAdapter(Context context, List<RobotsItem> robotsItemList) {

        this.context = context;
        this.robotsItemList = robotsItemList;
        this.inflater = LayoutInflater.from(context);
    }

    // RECUPERER LE NOMBRE D'ITEM
    @Override
    public int getCount() {
        return robotsItemList.size();
    }

    // RECUPERER L'ITEM
    @Override
    public RobotsItem getItem(int position) {
        // récupération de l'item par sa position
        return robotsItemList.get(position);
    }

    // RECUPERER l'ID DE L'ITEM
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // INFLATE PERMET DE DESERIALISE COMME SetContentView
        // En quelques sorte il eclate la vue pour récupérer chaque élément

        view = inflater.inflate(R.layout.adapter_item, null);

        // Get information about item
        // Trouver les informations à propos des item
        RobotsItem currentItem = getItem(i);
        final String itemName = currentItem.getName();
        String itemDescription = currentItem.getDescription();
        final String itemPrice = currentItem.getPrice();
        String mnemonic = currentItem.getMnemonic();

        // Get item icon view
        ImageView itemIconView = view.findViewById(R.id.item_icon);
        String resourceName = mnemonic;
        int resId = context.getResources().getIdentifier(resourceName, "drawable", context.getPackageName());
        // On "applique" l'image de "itemIconView" à "resId" avec la méthode setImageResource
        itemIconView.setImageResource(resId);

        // Get item name view
        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        // Get item description
        TextView itemDescriptionView = view.findViewById(R.id.item_description);
        itemDescriptionView.setText(itemDescription);

        // Get item price
        TextView itemPriceView = view.findViewById(R.id.item_price);
        itemPriceView.setText(itemPrice);


        return view;
    }
}
        /* -- ACTION CLICK FONCTIONNEL --
        // Action sur le click de la view qui englobe l'image et tout le texte
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Petite notification de " + itemName + ", qui coûte " + itemPrice, Toast.LENGTH_LONG).show();
            }
        });
        return view;
        */

        /*
        // TEST
        public void onClick (View v){
            openActivity2(intent)
        }

        // TEST
        public void openActivity2() {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }
        */
