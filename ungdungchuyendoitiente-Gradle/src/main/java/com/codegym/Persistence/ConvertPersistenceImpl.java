package com.codegym.Persistence;



import java.util.ArrayList;
import java.util.List;

public class ConvertPersistenceImpl implements GeneralPersistence{

    @Override
    public float convert(float usd) {
        return usd*23000;
    }
}
