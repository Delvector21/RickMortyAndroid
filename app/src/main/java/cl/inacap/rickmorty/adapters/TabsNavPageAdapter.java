package cl.inacap.rickmorty.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import cl.inacap.rickmorty.fragments.PersonajesFragment;
import cl.inacap.rickmorty.fragments.UbicacionesFragment;

public class TabsNavPageAdapter extends FragmentStatePagerAdapter {
    public TabsNavPageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    //Voy a hacer el codigo que se ejecuta cuando cambia de Tab
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new PersonajesFragment();
            case 1: return new UbicacionesFragment();
            default: return null;
        }

    }

    //Devolver la cantidad de Tabs
    @Override
    public int getCount() {
        return 2;
    }
}
