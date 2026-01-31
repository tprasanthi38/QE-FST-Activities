import pandas as pd
df = pd.read_excel('activity_19_data.xlsx')
print("Dimensions (Rows, Columns):", df.shape)
print("\nEmail Column Data:")
print(df['Email'])
sorted_df = df.sort_values(by='FirstName', ascending=True)
print("\nData Sorted by FirstName:")
print(sorted_df)