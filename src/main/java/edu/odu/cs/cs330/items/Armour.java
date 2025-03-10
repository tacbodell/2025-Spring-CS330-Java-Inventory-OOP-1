package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one piece of armour--as found in most video games.
 * This includes boots and helmets.
 *
 * Armour may not be stacked.
 */
public class Armour extends Item {
    /**
     * Durability decreases each time armour is used.
     */
    protected int durability;

    /**
     * The amount of damage that can be negated.
     */
    protected int  defense;

    /**
     * Base material out of which the armour is constructed.
     */
    protected String material;

    /**
     * Type of enchantment afforded (e.g. protection, feather_falling, or
     * unbreaking)
     */
    protected String modifier;

    /**
     * Enchantment level applied.
     */
    protected int modiferLevel;

    /**
     * Associated element--e.g., ice, fire, and lightning.
     */
    protected String element;

    /**
     * Default to a armour with an empty name, zero durability, zero defense,
     * blank material, no modifier a zero modifier level, and a blank element.
     */
    public Armour()
    {
        // Initialize all data members (including those inherited from Item)
	this.setDurability(0);
	this.setDefense(0);
	this.setMaterial("");
	this.setModifier("");
	this.setModifierLevel(0);
	this.setElement("");
	this.setName("");
	this.stackable = false;
    }

    /**
     * Duplicate a piece of armour.
     *
     * @param src armour to duplicate
     */
    public Armour(Armour src)
    {
        // Set and/or copy data members for *this* object based on *src*.
        this.setDurability(src.getDurability());
        this.setDefense(src.getDefense());
        this.setMaterial(src.getMaterial());
        this.setModifier(src.getModifier());
        this.setModifierLevel(src.getModifierLevel());
        this.setElement(src.getElement());
        this.setName(src.getName());
        this.stackable = src.isStackable();
    }

    /**
     * Retrieve armour durability.
     */
    public int getDurability()
    {
        return this.durability;
    }

    /**
     * Set armour durability.
     *
     * @param dur new durability value
     */
    public void setDurability(int dur)
    {
        this.durability = dur;
    }

    /**
     * Retrieve armour defense.
     *
     * @return total defense provided
     */
    public int getDefense()
    {
        return this.defense;
    }

    /**
     * Update defense.
     *
     * @param def replacement defense
     */
    public void setDefense(int def)
    {
        this.defense = def;
    }

    /**
     * Retrieve armour material.
     *
     * @return base material
     */
    public String getMaterial()
    {
        return this.material;
    }

    /**
     * Set armour Material.
     *
     * @param mat replacement material type
     */
    public void setMaterial(String mat)
    {
        this.material = mat;
    }

    /**
     * Retrieve armour modifier.
     *
     * @return buff/debuff provided
     */
    public String getModifier()
    {
        return this.modifier;
    }

    /**
     * Set armour modifier.
     *
     * @param mod updated modifier
     */
    public void setModifier(String m)
    {
        this.modifier = m;
    }

    /**
     * Retrieve armour modifier level.
     *
     * @return buff/debuff level
     */
    public int getModifierLevel()
    {
        return this.modiferLevel;
    }

    /**
     * Set armour modifier level.
     *
     * @param level replacement modifier level
     */
    public void setModifierLevel(int level)
    {
        this.modiferLevel = level;
    }

    /**
     * Retrieve armour element.
     *
     * @return element
     */
    public String getElement()
    {
        return this.element;
    }

    /**
     * Set armour element.
     *
     * @param ele new element
     */
    public void setElement(String ele)
    {
        this.element = ele;
    }

    @Override
    public boolean isStackable()
    {
        return this.stackable;
    }

    /**
     * Read Armour attributes.
     */
    @Override
    public void read(Scanner snr)
    {
        super.name      	= snr.next();
	this.material 		= snr.next();
	this.durability		= snr.nextInt();
	this.defense		= snr.nextInt();
	this.modifier		= snr.next();
	this.modiferLevel     	= snr.nextInt();
	this.element		= snr.next();
    }

    /**
     * Clone--i.e., copy--this Armour.
     */
    @Override
    public Item clone()
    {
        // Replace the next line
        return new Armour(this);
    }

    /**
     * *Print* one Armour.
     */
    @Override
    public String toString()
   {
   	String summaryLine = String.format(
            "  Nme: %s%n  Dur: %d%n  Def: %d%n  Mtl: %s%n  Mdr: %s (Lvl %d)%n  Emt: %s%n",
	   	this.getName(),
	      	this.getDurability(),
		this.getDefense(),
		this.getMaterial(),
		this.getModifier(),
		this.getModifierLevel(),
		this.getElement()
        );

        StringBuilder strBld = new StringBuilder();
        strBld.append(summaryLine);

        return strBld.toString();     
   }
}




