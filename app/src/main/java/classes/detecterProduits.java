package classes;

import android.content.Context;
import android.widget.Toast;

import interfaces.detections;

public class detecterProduits implements detections {
    private detections detect;

    public void setDetections(detections detect) {
        this.detect = detect;
    }

    @Override
    public void detected(Context context) {
        Toast.makeText(context, "Je suis un produit detecté", Toast.LENGTH_SHORT).show();
    }
}
