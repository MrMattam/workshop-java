package fr.mbo.workshops.annotation.exemple2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MesureurDeTemps {

    public static void executerAvecMesureTemps(Object instance) {
        for (Method method : instance.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(MesurerTempsExecution.class)) {
                try {
                    long debut = System.nanoTime();
                    method.invoke(instance);
                    long fin = System.nanoTime();
                    System.out.println("Exécution de " + method.getName() + " a pris " + (fin - debut) + " nanosecondes.");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
