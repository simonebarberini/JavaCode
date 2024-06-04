class Libro {
    String Name;

    public String getName() {
        return Name;
    }

    public Libro(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        return Name != null ? Name.equalsIgnoreCase(libro.Name) : libro.Name == null;
    }
}