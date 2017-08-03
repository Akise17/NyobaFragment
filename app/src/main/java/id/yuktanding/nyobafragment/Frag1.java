package id.yuktanding.nyobafragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Item> itemArrayList;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_frag1, container, false);

        itemArrayList = new ArrayList<>();

        itemArrayList.add(new Item("One Piece",5,"Perjalanan Bajak Laut",
                "https://assets.pinshape.com/uploads/image/file/112889/container_one-piece-keychain-3d-printing-112889.jpg"));
        itemArrayList.add(new Item("Attact On Titan",8,"Perjalanan Raksasa bugil",
                "https://i1.sndcdn.com/artworks-000116762804-oxayb7-t500x500.jpg"));
        itemArrayList.add(new Item("Saikin, Imouto no Yousu ga Chotto Okashiinda ga.",5,"Perjalanan Hantu Mencari Cinta",
                "https://i1.sndcdn.com/artworks-000133293110-vfd1nw-t500x500.jpg"));
        itemArrayList.add(new Item("Fullmetal Alchemis",5,"Perjalanan Kaka Beradik Mecari Batu",
                "https://i1.sndcdn.com/artworks-000113102014-fy2img-t500x500.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));
        itemArrayList.add(new Item("Sword Art Online",5,"Perjalanan di Dunia Maya Berujung Nyawa",
                "http://nerdreactor.com/wp-content/uploads/2014/08/Sword-Art-Online-Hollow-Fragment-NA-Visual-500x500_c.jpg"));

        recyclerView = (RecyclerView) view.findViewById(R.id.grid_layout);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        ItemAdapter2 itemAdapter = new ItemAdapter2(itemArrayList, getContext());
        recyclerView.setAdapter(itemAdapter);
        return view;
    }

}
