/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sample;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;


/**
 * Abstract base class for all kinds of groups of related Celdas.
 */
public abstract class CellGroup extends SetOfNine{

    public static Set<Integer> allNine = new CopyOnWriteArraySet<Integer>();
    static {
        for (int i = 1; i <= 9; i++) allNine.add(i);
    }

    private List<Celda> Celdas = new ArrayList<Celda>();
    
    /**
     * Constructor.
     */
    protected CellGroup() {
        super();
    }

    /**
     * Add another Celda object to the Celdas of this group.
     * @param Celda a Celda object.
     */
    public void addCelda(Celda celda) {
        Celdas.add(celda);
    }

    /**
     * Returns the Celda objects in this group.
     * @return a List of Celda objects.
     */
    public List<Celda> getCeldas() {
        return Celdas;
    }
}
