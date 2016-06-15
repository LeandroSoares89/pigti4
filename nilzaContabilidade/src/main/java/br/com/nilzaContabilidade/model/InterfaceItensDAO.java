package br.com.nilzaContabilidade.model;

import java.util.List;

public interface InterfaceItensDAO {
void inserirItem(Item item);
void updateItem(Item item);
void UpdateBaixaItem(Item item);
List<Item> selecItens();
}
