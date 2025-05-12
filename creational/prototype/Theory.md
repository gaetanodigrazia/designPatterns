## **📌 Prototype Pattern (Creational Pattern)**
Il **Prototype Pattern** è un **Creational Pattern** che consente di creare nuovi oggetti **clonando un'istanza esistente**, invece di crearli da zero con `new`.

---

### **🔹 Quando usarlo?**
- Quando la **creazione di un oggetto è costosa o complessa**.
- Quando vogliamo **evitare la duplicazione di codice** per configurare un nuovo oggetto.
- Quando abbiamo **molte varianti di un oggetto** e vogliamo semplificare la loro creazione.

## **📌 Cosa succede nel caso visto nel codice?**
1. **Abbiamo un'interfaccia `Prototype`** con il metodo `clone()`, che ogni classe può implementare.
2. **La classe `Car`** implementa `Prototype` e fornisce un'implementazione di `clone()`.
3. **La classe `CarRegistry`** mantiene un insieme di prototipi e permette di crearne nuove copie.
4. **Nel `main()`**, registriamo un'auto `Tesla` e poi creiamo una copia senza usare `new`.

---

## **✅ Vantaggi del Prototype Pattern**
✔ **Efficiente** → Evita costi elevati di creazione di nuovi oggetti.  
✔ **Evita la duplicazione di codice** → Non dobbiamo ridefinire la creazione di oggetti complessi.  
✔ **Flessibile** → Possiamo aggiungere nuovi prototipi senza modificare il codice esistente.

💡 **Perfetto per scenari in cui la creazione di oggetti è complessa e costosa!** 🚀
