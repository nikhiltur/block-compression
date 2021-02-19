import json
import os.path

blockName = input("Enter the name of the block: ")
print("The two recipe types are shaped and shapeless.")
recipeType = input("Enter the type of recipe to be used: ")

# To initialize these variables to avoid NameErrors
topRow = ""
middleRow = ""
bottomRow = ""
letter = ""

# Only runs if the recipe is shaped crafting
if recipeType == ("shaped"):
    letter = input("Enter the letter to be used: ")
    topRow = input("Enter the top row of letters: ")
    middleRow = input("Enter the middle row of letters: ")
    bottomRow = input("Enter the bottom row of letters: ")  

# Always runs to get necessary information
print("usedItem format is id:blockname (i.e. minecraft:dirt).")
usedItem = input("Enter the item used for crafting: ")
print("resultItem format is id:blockname (i.e. blockcompression:compressed_dirt).")
resultItem = input("Enter the item resulted from the crafting: ")
count = input("Enter the number of items crafted: ")
mod_id = input("Enter mod id for grouping purposes: ")

# Shaped recipe .json variable
shaped = {
    "type": "minecraft:crafting_shaped",
    "pattern": [
      '' + topRow + '',
      '' + middleRow + '',
      '' + bottomRow + ''
    ],
    "key": {
      '' + letter + '': {
        "item": '' + usedItem + ''
      }
    },
    "result": {
      "item": '' + resultItem + '',
      "count": int(count)
    },
    "group": mod_id
  }

# Shapeless recipe .json variable
shapeless = {
    "type": "minecraft:crafting_shapeless",
    "ingredients": [
        {
            "item": usedItem
        }
    ],
    "result": {
        "item": resultItem,
        "count": int(count)
    },
    "group": mod_id
}

# Shaped recipe generator
if recipeType == ("shaped"):
    shaped_crafting_recipeJSON = json.dumps(shaped, indent = 4)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\data\\blockcompression\\recipes\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(shaped_crafting_recipeJSON)

    j = open(completeName, "w")
    j.write(shaped_crafting_recipeJSON)
    j.close()

# Shapeless recipe generator
elif recipeType == ("shapeless"):
    shapeless_crafting_recipeJSON = json.dumps(shapeless, indent = 4)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\data\\blockcompression\\recipes\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(shapeless_crafting_recipeJSON)

    j1 = open(completeName, "w")
    j1.write(shapeless_crafting_recipeJSON)
    j1.close()

# Something went wrong
else:
    print("Something went wrong, please try again.")
