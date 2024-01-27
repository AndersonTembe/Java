package Anderson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class StorageService implements StorageServiceInterface{
    private List<Client> unidades;
    private List<Client> clients;
    private Map<Client, List<Rental>> rentals;

    public StorageService() {
        this.unidades = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.rentals = new HashMap<>();
    }

    public void addUnit(Client unit) {
        this.unidades.add(unit);
    }

    public void addCustomer(Client clients) {
        this.clients.add(clients);
    }

    public void rent(Client clients, Client unit) {
        Rental rental = new Rental(0, 0);
        if (!this.rentals.containsKey(clients)) {
            this.rentals.put(clients, new ArrayList<>());
        }
        this.rentals.get(clients).add(rental);
    }

 

    public List<Client> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Client> unidades) {
        this.unidades = unidades;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Map<Client, List<Rental>> getRentals() {
        return rentals;
    }

    public void setRentals(Map<Client, List<Rental>> rentals) {
        this.rentals = rentals;
    }

    @Override
    public boolean registerClient(int taxId, String name, ClientType type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerClient'");
    }
    @Override
    public Client getClient(int taxId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClient'");
    }
    @Override
    public void addStorageUnit(StorageUnit storageUnit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStorageUnit'");
    }
    @Override
    public void addStorageUnits(Collection<StorageUnit> storageUnits) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStorageUnits'");
    }
    @Override
    public boolean checkAvailable(StorageUnit storageUnit, LocalDate startDate, LocalDate endDate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkAvailable'");
    }
    @Override
    public List<StorageUnit> findAvailableUnits(UnitType unitType, LocalDate fromDate, int duration,
            int[] minDimensions) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAvailableUnits'");
    }
    @Override
    public boolean rentStorageUnit(Client client, StorageUnit unit, LocalDate startDate, int duration) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rentStorageUnit'");
    }
    @Override
    public double calculateTotalCost(StorageUnit unit, int duration) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTotalCost'");
    }
    @Override
    public List<String> listRentals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listRentals'");
    }
    @Override
    public List<String> listRentals(UnitType unitType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listRentals'");
    }


    
}
