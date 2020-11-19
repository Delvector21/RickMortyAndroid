package cl.inacap.rickmorty.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.rickmorty.dto.Ubicacion;

public class UbicacionesAdapter extends ArrayAdapter<Ubicacion> {

    private Activity activity;
    private List<Ubicacion> ubicaciones;


    public UbicacionesAdapter(@NonNull Activity context, int resource, @NonNull List<Ubicacion> objects) {
        super(context, resource, objects);
        this.activity = context;
        this.ubicaciones = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = this.activity.getLayoutInflater();



        return null;

    }
}
